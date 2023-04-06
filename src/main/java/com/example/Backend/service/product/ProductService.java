package com.example.Backend.service.product;

import com.example.Backend.entity.product.Product;
import com.example.Backend.service.product.request.ProductRegisterRequest;
import com.example.Backend.service.product.response.ProductListResponse;
import com.example.Backend.service.product.response.ProductResponse;

import java.util.List;

public interface ProductService {
    Boolean register(ProductRegisterRequest productRegisterRequest);

    List<ProductListResponse> getAllProducts();

    Boolean delete(Long productId);
    
    ProductResponse getProductById(Long productId);
}
