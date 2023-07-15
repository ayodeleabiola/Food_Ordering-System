package com.mystartup.foodapplication;

import com.mystartup.foodapplication.model.FoodModelClass;
import com.mystartup.foodapplication.repository.FoodRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FoodApplication {
    public FoodRepository foodRepository;

    public FoodApplication(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(FoodApplication.class, args);
    }
   /** public void run(String ...args){
        FoodModelClass foodModelClass1 = new FoodModelClass("Eba",2000);
        FoodModelClass foodModelClass2 = new FoodModelClass("Iyan",13000);
         foodRepository.save(foodModelClass1);
         foodRepository.save(foodModelClass2);
         foodRepository.findByName("Eba").forEach(val->System.out.print(val));
         Double price= foodRepository.findByPrice(2000).getPrice();
         System.out.print(price);

    }**/
}
