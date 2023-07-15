package com.mystartup.foodapplication.model;
import jakarta.persistence.*;
@Entity
@Table(name = "Food")
public class FoodModelClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String name;
    public double price;
 public FoodModelClass(){

 }
    public FoodModelClass(Long id,String name, double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
