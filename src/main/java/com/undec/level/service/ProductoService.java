package com.undec.level.service;

import com.undec.level.dto.Response;
import com.undec.level.model.ProductoEntity;
import com.undec.level.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

   @Autowired
   private ProductoRepository productoRepository;


    public Response findAll(){
        Response response= new Response();
        try {
            List<ProductoEntity> productoList = productoRepository.findAll();
            response.setData(productoList);
        }catch(Exception e){
            e.printStackTrace();
            throw e;
        }
        return response;
    }

    public Response findOneById(String id){
        Response response= new Response();
        try {
            ProductoEntity productoEntity = productoRepository.findById(Integer.parseInt(id)).get();
            response.setData(productoEntity);
        }catch(Exception e){
            e.printStackTrace();

        }
        return response;
    }
}
