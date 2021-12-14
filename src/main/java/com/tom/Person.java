package com.tom;

public class Person {
    float weight;
    float height;
    public Person(float weight, float height) {
        this.weight = weight;
        this.height = height;
    }
    public float bmi() {
        return weight/(height*height);
    }

    public void hello() {
        System.out.println("viva! boss, Hello!");
    }
}
