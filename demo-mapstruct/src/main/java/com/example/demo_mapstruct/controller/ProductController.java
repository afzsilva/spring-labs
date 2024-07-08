package com.example.demo_mapstruct.controller;

import com.example.demo_mapstruct.config.HandleText;
import com.example.demo_mapstruct.config.factorymethod.Calculadora;
import com.example.demo_mapstruct.config.factorymethod.CalcularService;
import com.example.demo_mapstruct.dto.ProductDTO;
import com.example.demo_mapstruct.mapper.ProductMapper;
import com.example.demo_mapstruct.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/teste")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductMapper mapper;

    @Autowired
    HandleText handleText;

    @Autowired
    CalcularService  calcularService;



    @PostMapping
    public ResponseEntity<ProductDTO> saveProduct(@RequestBody ProductDTO productDTO){
       ProductDTO dto = productService.save(mapper.toProductEntity(productDTO));
       return ResponseEntity.status(HttpStatus.CREATED).body(dto);
    }


    @GetMapping
    public ResponseEntity<ProductDTO> findProduct(@RequestBody ProductDTO productDTO){
        ProductDTO dto = productService.find(mapper.toProductEntity(productDTO));
        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }


    @GetMapping("str")
    public String frase(){
        return handleText.upperText("ola-mundo");
    }

    @GetMapping("somar")
    public void testeFactoryMethod(){
        int x = 10;
        int y = 5;
        calcularService.somar(x,y);
    }

}
