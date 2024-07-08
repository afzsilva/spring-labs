package com.example.demo_mapstruct.service;

import com.example.demo_mapstruct.dto.ProductDTO;
import com.example.demo_mapstruct.entity.Product;

public interface ProductService {

    ProductDTO save(Product product);

    ProductDTO find(Product product);

}
