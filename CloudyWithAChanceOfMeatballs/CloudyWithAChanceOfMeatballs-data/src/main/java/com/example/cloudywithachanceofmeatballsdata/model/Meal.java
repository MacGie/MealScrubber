package com.example.cloudywithachanceofmeatballsdata.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.boot.context.properties.bind.DefaultValue;

@Entity
public class Meal {
    @Id
    private Long id;
    private String meal;

    private String drinkAlternate;

    private String category;
    private String area;
    private String instruction;
    private String tags;
    private String youtube;
    private String ingredient1;
    private String ingredient2;

    private String ingredient3;

    private String ingredient4;

    private String ingredient5;

    @Column(name="strIngredient6")
    private String ingredient6;

    @Column(name="strIngredient7")
    private String ingredient7;

    @Column(name="strIngredient8")
    private String ingredient8;

    @Column(name="strIngredient9")
    private String ingredient9;

    @Column(name="strIngredient10")
    private String ingredient10;

    @Column(name="strIngredient11")
    private String ingredient11;

    @Column(name="strIngredient12")
    private String ingredient12;

    @Column(name="strIngredient13")
    private String ingredient13;

    @Column(name="strIngredient14")
    private String ingredient14;

    @Column(name="strIngredient15")
    private String ingredient15;

    @Column(name="strIngredient16")
    private String ingredient16;

    @Column(name="strIngredient17")
    private String ingredient17;

    @Column(name="strIngredient18")
    private String ingredient18;

    @Column(name="strIngredient19")
    private String ingredient19;

    @Column(name="strIngredient20")
    private String ingredient20;
    @Column(name="strMeasure1")
    private String measure1;

    @Column(name="strMeasure2")
    private String measure2;

    @Column(name="strMeasure3")
    private String measure3;

    @Column(name="strMeasure4")
    private String measure4;

    @Column(name="strMeasure5")
    private String measure5;

    @Column(name="strMeasure6")
    private String measure6;

    @Column(name="strMeasure7")
    private String measure7;

    @Column(name="strMeasure8")
    private String measure8;

    @Column(name="strMeasure9")
    private String measure9;

    @Column(name="strMeasure10")
    private String measure10;

    @Column(name="strMeasure11")
    private String measure11;

    @Column(name="strMeasure12")
    private String measure12;

    @Column(name="strMeasure13")
    private String measure13;

    @Column(name="strMeasure14")
    private String measure14;

    @Column(name="strMeasure15")
    private String measure15;

    @Column(name="strMeasure16")
    private String measure16;

    @Column(name="strMeasure17")
    private String measure17;

    @Column(name="strMeasure18")
    private String measure18;

    @Column(name="strMeasure19")
    private String measure19;

    @Column(name="strMeasure20")
    private String measure20;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
