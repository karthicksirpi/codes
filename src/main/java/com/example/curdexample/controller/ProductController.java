package com.example.curdexample.controller;

import com.example.curdexample.entity.Product;
import com.example.curdexample.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController
{
    private ProductService service;
    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product)
    {
        return service.saveProduct(product);
    }
    @PostMapping("/addProducts")
    public List<Product> addProduct(@RequestBody List<Product> product)
    {
        return service.saveProducts(product);
    }
    @GetMapping("/products")
    public List<Product> findAllProducts()
    {
        return service.getProducts();
    }
    @GetMapping("/product/{id}")
    public Product findProductById(@PathVariable int id)
    {
        return service.getProductById(id);
    }
    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product)
    {
        return service.updateProduct(product);
    }
    @DeleteMapping("delete/{id}")

    public String deleteProduct(@PathVariable int id)
    {
        return service.deleteProduct(id);
    }



}
