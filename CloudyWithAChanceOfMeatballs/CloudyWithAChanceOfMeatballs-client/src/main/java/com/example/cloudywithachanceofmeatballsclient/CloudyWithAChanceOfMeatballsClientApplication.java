package com.example.cloudywithachanceofmeatballsclient;

import com.example.cloudywithachanceofmeatballsclient.client.IMealClient;
import com.example.cloudywithachanceofmeatballsclient.client.IMealClientSettings;
import com.example.cloudywithachanceofmeatballsclient.client.MealClient;
import com.example.cloudywithachanceofmeatballsclient.client.MealClientSettings;
import com.example.cloudywithachanceofmeatballsclient.contract.MealDTO;
import com.example.cloudywithachanceofmeatballsclient.contract.MealListDto;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class CloudyWithAChanceOfMeatballsClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudyWithAChanceOfMeatballsClientApplication.class, args);
        IMealClientSettings settings=new MealClientSettings();
        IMealClient mealClient=new MealClient(settings);
        MealListDto mealsByName=mealClient.getMealsByName("arrabiata");
        System.out.println(mealsByName.getMealDTOS().get(0).toString());



    }


}
