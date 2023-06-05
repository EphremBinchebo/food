package com.noFoodWaste.controller;

import com.noFoodWaste.model.Food;
import com.noFoodWaste.service.FoodService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FoodController {

    @Resource(name = "foodService")
    private FoodService foodService;

    @RequestMapping(value = {"/food"})
    public String displayFood(){
        return "food";
    }

    @GetMapping("/foods")
    public List<Food> getFood(){
        List<Food> foods = foodService.getAllFood();

        if (foods == null || foods.isEmpty()) {
            throw new IllegalArgumentException("No food, yet");
        } else {
            return foods;
        }
    }
}
