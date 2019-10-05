package com.kodilla.kodillacourse;

public class Calculator {
    public void Addiion() {
        System.out.println("Dodawanie");

    }

    public void Subtraction() {
        System.out.println("Odejmowanie");
    }

    public static void main(String args[]){
        Calculator calculator = new Calculator();
        calculator.Addiion();
        calculator.Subtraction();
    }
}
