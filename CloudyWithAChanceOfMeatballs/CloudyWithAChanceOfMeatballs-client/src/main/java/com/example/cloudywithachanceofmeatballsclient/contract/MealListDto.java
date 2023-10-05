package com.example.cloudywithachanceofmeatballsclient.contract;

import lombok.NoArgsConstructor;

import java.util.List;
@NoArgsConstructor
public class MealListDto {
    List<MealDTO> mealDTOS;

    public List<MealDTO> getMealDTOS() {
        return mealDTOS;
    }

    public void setMealDTOS(List<MealDTO> mealDTOS) {
        this.mealDTOS = mealDTOS;
    }
}
