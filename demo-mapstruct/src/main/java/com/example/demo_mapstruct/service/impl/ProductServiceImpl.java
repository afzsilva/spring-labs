package com.example.demo_mapstruct.service.impl;

import com.example.demo_mapstruct.dto.ProductDTO;
import com.example.demo_mapstruct.entity.Product;
import com.example.demo_mapstruct.mapper.ProductMapper;
import com.example.demo_mapstruct.repository.ProductRepository;
import com.example.demo_mapstruct.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {


    @Autowired
    private ProductRepository repository;

    @Autowired
    private ProductMapper mapper;

    @Override
    public ProductDTO save(Product product) {
        return mapper.toProductDTO(repository.save(product));
    }

    @Override
    public ProductDTO find(Product product) {
        return mapper.toProductDTO(repository.findByDescription(product.getDescription()));
    }
}
