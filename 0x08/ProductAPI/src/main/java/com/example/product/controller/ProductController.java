package com.example.product.controller;

import com.example.product.model.Product;
import com.example.product.model.ProductRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "api")
@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    ProductRepository repository;


    @ApiOperation(value= "- Responsável por retornar uma mensagem de boas vindas. ")
    @GetMapping(value = "/welcome")
    public String welcome() {
        return "BEM VINDO À PRODUCT REST API.";
    }

    @ApiOperation(value= "- Responsável por retornar uma lista de produtos.")
    @ApiResponse(code = 11,  message = "Warning - the process returned more than 1000 products.")
    @GetMapping(value = "/allProducts")
    public List<Product> allProducts(){
        return repository.getAllProducts();
    }

    @ApiOperation(value = "- Responsável por retornar um produto pelo id.")
    @ApiResponse(code = 12 , message= "The field id not informed. This information is required.")
    @GetMapping(value = "/findProductById/{id}")
    public Product findProductById(@PathVariable("id") Integer id){
        return repository.getProductById(id);
    }

    @ApiOperation(value = "- Responsável por adicionar um produto. ")
    @ApiResponse(code = 10 , message = "Required fields not informed.")
    @PutMapping("/updateProduct")
    public void updateProduct(@RequestBody Product product) {
        repository.updateProduct(product);
    }

    @ApiOperation(value = "- Responsável por remover um produto.")
    @ApiResponse(code = 13 , message = "User not allowed to remove a product from this category.")
    @DeleteMapping("/removeProduct")
    public void removeProduct(@RequestBody Product product) {
        repository.removeProduct(product);
    }
}
