package com.mystartup.foodapplication.controller;
import com.mystartup.foodapplication.model.FoodModelClass;
import com.mystartup.foodapplication.service.FoodService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
public class FoodControler {
    public FoodService foodService;

    public FoodControler(FoodService foodService) {
        this.foodService = foodService;
    }

    @PostMapping(value="/home")
    public String insertIntoFood(Model model,@ModelAttribute("food") FoodModelClass food) {
        int result=foodService.insertIntoFood(food);
        if (result<1) {
            model.addAttribute("ErrorMessage %s",String.format("Could not add food %s",food.getName()));
        }
        model.addAttribute("Success",String.format("Sucessfully add name %s",food.getName()));
        Iterable<FoodModelClass>foods=foodService.getFood();
        model.addAttribute("foods",foods);

        return "home";
    }
    @GetMapping("/home")
    public String getFood(Model model,FoodModelClass foodModelClass) {
        Iterable<FoodModelClass> foods = foodService.getFood();
        model.addAttribute("foods", foods);
        model.addAttribute("food",new FoodModelClass());

        return "Home.html";
    }

   /** @GetMapping("/home")
    public String getHome(Model model,FoodModelClass foodModelClass) {
       // model.addAttribute("Home", "Hello Nigeria");
       List <FoodModelClass> foodModelClass1 =foodService.getFood();
       model.addAttribute("foodModelClass1",foodModelClass1);
        return "Home.html";
    }**/


}

