package com.example.demo_mapstruct.mapper;


import com.example.demo_mapstruct.dto.ProductDTO;
import com.example.demo_mapstruct.entity.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    Product toProductEntity(ProductDTO dto);

    ProductDTO toProductDTO(Product product);

}
