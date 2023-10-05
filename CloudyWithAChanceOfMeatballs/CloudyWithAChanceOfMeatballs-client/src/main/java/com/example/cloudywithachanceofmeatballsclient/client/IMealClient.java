package com.example.cloudywithachanceofmeatballsclient.client;

import com.example.cloudywithachanceofmeatballsclient.contract.MealListDto;

public interface IMealClient {
    MealListDto getMealsByName(String name);
}
