package com.kodilla.kodillacourse;

public class Calculator {
    public void Addition() {
        System.out.println("Dodawanie");

    }

    public void Subtraction() {
        System.out.println("Odejmowanie");
    }

    public static void main(String args[]){
        Calculator calculator = new Calculator();
        calculator.Addition();
        calculator.Subtraction();
    }
}
