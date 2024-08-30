package org.training.product.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.training.product.model.dto.Response;
import org.training.product.model.dto.ProductDto;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @PostMapping("/create")
    public ResponseEntity<Response> addProduct(@RequestBody ProductDto productDto) {
        // write your logic here
        return null;
    }

    @GetMapping("/owner/{ownerId}")
    public ResponseEntity<List<ProductDto>> getProductByOwnerId(@PathVariable Long ownerId) {
        // write your logic here
        return null;
    }

    @GetMapping("/all")
    public ResponseEntity<Page<ProductDto>> getAllProductList(Pageable pageable) {
        // write your logic here
        return null;
    }

}
