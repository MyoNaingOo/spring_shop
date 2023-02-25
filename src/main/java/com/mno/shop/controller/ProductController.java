package com.mno.shop.controller;

import com.mno.shop.entity.Product;
import com.mno.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/product")
public class ProductController {


    @Autowired
    private ProductService productService;





    @PostMapping("add")
    public void addProduct(@RequestBody Product product){
        productService.addProduct(product);
    }


    @GetMapping("products")
    public List<Product> getPros(){
        return  productService.getProducts();
    }


    @GetMapping(value = "product/{id}",consumes = MediaType.ALL_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Product> getPro(@PathVariable("id") Long id){
        return  productService.getProduct(id);
    }

    @DeleteMapping("delete/{id}")
    public void deletePro(@PathVariable("id") Long id){
        productService.deleteProduct(id);
    }




}
