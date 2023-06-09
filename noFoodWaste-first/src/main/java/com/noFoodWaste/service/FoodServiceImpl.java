package com.noFoodWaste.service;

import com.noFoodWaste.model.Food;
import com.noFoodWaste.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    private FoodRepository foodRepository;

    @Override public List<Food> getAllFood() {
        return foodRepository.findAll();
    }


}
