package com.undec.level.controller;

import com.undec.level.dto.Response;
import com.undec.level.service.ProductoService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.TabExpander;

@RestController
@RequestMapping("/productos")
@Tag(name = "Productos", description = "Toda la info de productos!")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping()
    public ResponseEntity<Response> list(){
        Response response = productoService.findAll();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Response> get(@PathVariable String id){
        Response response = productoService.findOneById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Response> put (@RequestBody Object input){
        Response response = new Response();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Response> post (@RequestBody Object input){
        Response response = new Response();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Response> delete (@PathVariable String id){
        Response response = new Response();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
