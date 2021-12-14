package com.tom;

public class Runner {
    public static void main(String[] args) {
        float h = 1.7f;
        float w = 71.5f;
        float bmi = w/(h*h);
        System.out.println("Your BMI is " + bmi);


        Person p = new Person(71.5f, 1.7f);
        System.out.println("Your BMI is " + p.bmi());
    }
}
