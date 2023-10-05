package com.example.cloudywithachanceofmeatballsdata.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.boot.context.properties.bind.DefaultValue;

@Entity
public class Meal {
    @Id
    private String id;
    @Column(name="strMeal")
    private String meal;
    @Column(name="strDrinkAlternate")
    private String drinkAlternate;
    @Column(name="strCategory")
    private String category;
    @Column(name="strArea")
    private String area;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
