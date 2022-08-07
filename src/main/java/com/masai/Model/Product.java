package com.masai.Model;

public class Product {
    private Integer id;
    private String name;
    private Integer price;
    private String brand;
    private String category;
    private Integer registration_No;
    private String manufacturer_Id;

    public Product(Integer id, String name, Integer price, String brand, String category, Integer registration_No, String manufacturer_Id) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.category = category;
        this.registration_No = registration_No;
        this.manufacturer_Id = manufacturer_Id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getRegistration_No() {
        return registration_No;
    }

    public void setRegistration_No(Integer registration_No) {
        this.registration_No = registration_No;
    }

    public String getManufacturer_Id() {
        return manufacturer_Id;
    }

    public void setManufacturer_Id(String manufacturer_Id) {
        this.manufacturer_Id = manufacturer_Id;
    }

    @Override
    public String toString() {
        return "ProductController{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", category='" + category + '\'' +
                ", registration_No=" + registration_No +
                ", manufacturer_Id='" + manufacturer_Id + '\'' +
                '}';
    }
}
