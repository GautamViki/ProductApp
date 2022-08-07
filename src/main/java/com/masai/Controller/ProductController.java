package com.masai.Controller;

import com.masai.Model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {
    @GetMapping("/hii")
    public String sayHii(){
        return "Hii vikas...";
    }

    @GetMapping("/getProducts")
    public List<Product> getAllProduct(){
        return Arrays.asList(
                 new Product(1,"Mobile",20000,"Iqoo","Electronics",
                    5486,"ABD578"),
                new Product(2,"TV",40000,"LG","Electronics",
                        5016,"LBD578"),
                new Product(3,"Biscuit",150,"GoodDay","Food",
                        486,"GD518"),
                new Product(4,"Fortune",500,"OIL","Food",
                        186,"FT078"),
                new Product(5,"Shirt",2000,"PeterEngland","Cloth",
                        1286,"PTY010")
        );
    }

    @GetMapping("getProducts/{id}")
        public Product getProduct(@PathVariable("id") Integer id){
        if (id>11){
            throw new IllegalArgumentException("Product not found......");
        }
        Product product=new Product(id,"Shirt",2000,"PeterEngland",
                "Cloth",1286,"PTY010");
        return product;
    }

    @PostMapping(value = "/products",consumes = MediaType.APPLICATION_JSON_VALUE)
    public String saveProducts(@RequestBody Product product){
        if(product.getId()==null){
            throw new IllegalArgumentException("Null value error........");
        }
            return "Product stored "+product;
    }

    @DeleteMapping("product/{id}")
    public String productHandler(@PathVariable("id") Integer id){
        if (id>10){
            throw new IllegalArgumentException("Product not exist.......");
        }
        Product product=new Product(id,"Biscuit",150,"GoodDay",
                "Food",486,"GD518");
        return "Product deleted "+product;
    }

    @PutMapping("products/{id}")
    public Product productHandler(@RequestBody Product product,@PathVariable("id")Integer id){
        product.setId(id);
        product.setPrice(product.getPrice()+5000);
        product.setBrand("Atlas");
        product.setName("BiCycle");
        product.setCategory("Vehicle");
        return product;
    }


}
