package com.mihab.sbmysqlcrud.controller;

import com.mihab.sbmysqlcrud.entity.Product;
import com.mihab.sbmysqlcrud.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/product")
    public Product saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @PostMapping("/products")
    public List<Product> saveProduct(@RequestBody List<Product> products) {
        return productService.saveProducts(products);
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }


    @GetMapping("/product/{name}")
    public Product getProductByName(@PathVariable String name) {
        return productService.getProductByName(name);
    }

    @DeleteMapping("/product/{id}")
    public String deleteProduct(@PathVariable int id) {
        return productService.deleteProduct(id);
    }

    @PutMapping("/product")
    public Product updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }

}
