package com.noFoodWaste.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;


@Entity
@Table(name="food")
public class Food {



    public Food(String name, String amount, String location){
        this.name = name;
        this.amount = amount;
        this.location = location;

    }

    public Food(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    public String name;

public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Column(nullable = false)
    private  String amount;

    @Column(nullable = false)
    private String location;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Food(Long id, String name, String amount, String location) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.location = location;
    }
}
