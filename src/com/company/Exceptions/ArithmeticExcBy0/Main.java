package com.company.Exceptions.ArithmeticExcBy0;

public class Main {
    public static void main(String[] args) {

        try {
            int result = divide(5,0);
        } catch (ArithmeticException e){
//            e.printStackTrace();
        }


        System.out.println("A teraz się wyświetlę");

    }

    public static int divide (int a, int b){
        return a/b;

    }
}
