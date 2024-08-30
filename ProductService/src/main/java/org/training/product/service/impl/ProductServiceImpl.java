package org.training.product.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.training.product.model.dto.Response;
import org.training.product.model.dto.ProductDto;
import org.training.product.service.ProductService;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public Response addProduct(ProductDto productDto) {
        // write your logic here
        return null;
    }

    @Override
    public Page<ProductDto> getAllProductList(Pageable pageable) {
        // write your logic here
        return null;
    }

    @Override
    public List<ProductDto> getProductByOwnerId(Long ownerId) {
        // write your logic here
        return null;
    }

}
