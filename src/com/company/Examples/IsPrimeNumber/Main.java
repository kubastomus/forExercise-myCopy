package com.company.Examples.IsPrimeNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value: ");
        int number = scanner.nextInt();

        if(number <= 1){
            System.out.println("Przerywam pracę");
            return;
        }

        boolean isPrimeNumber = true;

        for(int i = 2; i < number; i++){
            if(number % i == 0){
                isPrimeNumber = false;
                break;
            }
        }

        if(isPrimeNumber) {
            System.out.println(number + " jest liczbą pierwszą");
        } else {
            System.out.println(number + " nie jest liczbą pierwszą");
        }


    }
}
