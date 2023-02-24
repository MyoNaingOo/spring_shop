package com.mno.shop.service;

import com.mno.shop.entity.Product;
import com.mno.shop.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public void addProduct(Product product){
        product.setDate(LocalDate.now());
        productRepo.save(product);
    }


    public List<Product> getProduct(){
        return   productRepo.findAll();
    }

    public void deleteProduct(Long id){
        productRepo.deleteById(id);
    }

    public void updateProduct(Product product){
        productRepo.save(product);
    }

}
