package com.example;

public class App {

    // a. Addition
    public int add(int a, int b) {
        return a + b;
    }

    // b. Even or Odd
    public String evenOdd(int n) {
        return (n % 2 == 0) ? "Even" : "Odd";
    }

    // c. Multiplication
    public int multiply(int a, int b) {
        return a * b;
    }

    // d. Factorial
    public int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    // e. Prime Number
    public boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}