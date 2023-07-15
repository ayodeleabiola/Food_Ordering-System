package com.mystartup.foodapplication.repository;

import com.mystartup.foodapplication.model.FoodModelClass;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface FoodRepository extends CrudRepository<FoodModelClass,Long> {
    List<FoodModelClass> findByName(String name);
    List<FoodModelClass> findByPriceOrderById(Long id);
    FoodModelClass findByPrice(double price);


    Iterable<FoodModelClass> findAll();
    //int insertIntoFood(FoodModelClass foodModelClass); // sample

}




