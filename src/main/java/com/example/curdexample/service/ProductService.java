package com.example.curdexample.service;

import com.example.curdexample.entity.Product;
import com.example.curdexample.repository.ProductRepository;

import java.util.List;

public class ProductService {
    private ProductRepository repository;
    public Product saveProduct(Product product)
    {

        return repository.save(product);
    }
    public List<Product> saveProducts(List<Product> product)
    {

        return repository.saveAll(product);
    }
    public  Product getProductById(int id)
    {

        return repository.findById(id).orElse(null);
    }
    public  List<Product> getProducts()
    {

        return repository.findAll();
    }
    public String deleteProduct(int id)
    {
        repository.deleteById(id);
        return "Product is removed !!!!"+id;
    }
    public Product updateProduct(Product product)
    {
        Product existingProduct=repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return repository.save(existingProduct);

    }
}
