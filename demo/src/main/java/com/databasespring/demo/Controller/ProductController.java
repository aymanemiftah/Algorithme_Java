package com.databasespring.demo.Controller;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.databasespring.demo.Model.Product;
import com.databasespring.demo.repository.ProductRepository;

@RestController
public class ProductController {

    @Autowired
    ProductRepository repository;


    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return repository.findAll();
    }

    @GetMapping("/product/{id}")
    public Product getproductById(@PathVariable("id") int id ){
        return repository.findById(id).get();
    }
    @PostMapping("/product")
    public Product Createproduct(@RequestBody Product product){
        return repository.save(product); 
    }

    @PutMapping("/product")
    public Product Updateproduct(@RequestBody Product product){
       
    

            return  repository.save(product);
        
    }
    @DeleteMapping("/product/{id}")
    public void Deleteproduct(@PathVariable("id") int id){
        repository.deleteById(id);
    }

}
