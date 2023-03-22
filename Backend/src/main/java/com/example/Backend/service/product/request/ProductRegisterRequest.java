package com.example.Backend.service.product.request;

import com.example.Backend.entity.product.ImageData;
import com.example.Backend.entity.product.Product;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
@RequiredArgsConstructor
public class ProductRegisterRequest {

    final private String name;
    final private String description;
    final private Integer stock;
    final private Integer price;
    final private List<String> savedFilePaths;

    public Product toProduct() {
        List<ImageData> imageDataList = new ArrayList<>();
        for (String path : savedFilePaths) {
            ImageData imageData = new ImageData();
            imageData.setImageData(path);
            imageDataList.add(imageData);
        }
        return new Product(name, description, stock, price, imageDataList);
    }
}
