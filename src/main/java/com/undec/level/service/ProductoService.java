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


    public Response fineAll(){
        Response response= new Response();
        try {
            List<ProductoEntity> productoList = productoRepository.findAll();
            response.setData(productoList);
        }catch(Exception e){

        }
        return response;
    }
}
