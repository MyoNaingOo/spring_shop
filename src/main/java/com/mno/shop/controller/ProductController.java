package com.mno.shop.controller;

import com.mno.shop.entity.Product;
import com.mno.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public List<Product> getPro(){
        return  productService.getProduct();
    }


    @DeleteMapping("delete/{id}")
    public void deletePro(@PathVariable("id") Long id){
        productService.deleteProduct(id);
    }



}
