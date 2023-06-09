package com.noFoodWaste.controller;

import com.noFoodWaste.service.FoodServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FoodController {

    @Autowired
    private FoodServiceImpl foodServiceImpl;

    @GetMapping("/food")
    public String viewFoodPage(Model model){
        model.addAttribute("allfoodlist", foodServiceImpl.getAllFood());
        return "food";

    }

    @RequestMapping(value = {"/food"})
    public String displayFood(){
        return "food";
    }

//    @GetMapping("/foods")
//    public List<Food> getFood(){
//        List<Food> foods = foodService.getAllFood();
//
//        if (foods == null || foods.isEmpty()) {
//            throw new IllegalArgumentException("No food, yet");
//        } else {
//            return foods;
//        }
//    }
}
