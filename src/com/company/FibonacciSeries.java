package com.company;

import java.util.Scanner;

class Fibonacci {
    // The Fibonacci series is a series where the next term is the sum of previous two terms.

        public void generateFibonacci () {  // Method to generate the series
            int n = 0, n1 = 0, n2 = 1;  // Initialization of variables
            System.out.println("How many numbers you want in Fibonacci:");
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();  // Allows user to enter the maximum number
            for (int i = 1; i <= n; i++) {
                System.out.print(n1 + " , ");
                int sum = n1 + n2;
                n1 = n2;
                n2 = sum;
            }
        }

        }
        public class FibonacciSeries{
    public static void main(String[]args){
        Fibonacci fibonacci = new Fibonacci();
                fibonacci.generateFibonacci();

            }
        }


