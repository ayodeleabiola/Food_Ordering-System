package com.mystartup.foodapplication.service;

import com.mystartup.foodapplication.model.FoodModelClass;
import com.mystartup.foodapplication.repository.FoodRepository;
import org.springframework.stereotype.Service;

@Service
public class FoodService {
    public FoodRepository foodRepository;
    public FoodService(FoodRepository foodRepository){
        this.foodRepository=foodRepository;
    }
    public Iterable<FoodModelClass> getFood(){
        Iterable<FoodModelClass> foods=foodRepository.findAll();
        return foods;
    }
    public int insertIntoFood(FoodModelClass food){
           foodRepository.save(food);
        return 1;

    }
}



