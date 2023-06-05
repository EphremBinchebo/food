package com.noFoodWaste.service;

import com.noFoodWaste.model.Food;
import com.noFoodWaste.repository.FoodRepository;
import com.noFoodWaste.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;

    public List <Food> getAllFood(){
        return foodRepository.findAll();
    }


}
