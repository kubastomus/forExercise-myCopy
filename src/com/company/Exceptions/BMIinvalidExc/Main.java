package com.company.Exceptions.BMIinvalidExc;

public class Main {
    public static void main(String[] args) throws InvalidBmiException{

        System.out.println(getBmiResult(83, 181));
    }

    public static String getBmiResult(int weight, int height) throws InvalidBmiException {

        double heightInM = (double) height / 100;
        double bmi = weight / Math.pow(heightInM, 2);

        if (bmi < 10 || bmi > 100){
            throw new InvalidBmiException("BMI must be beetwen 10 and 100, your BMI: " + bmi + " it's wrong");
        }

        System.out.println(bmi);
        return bmi < 18.5 || bmi > 24.9 ? "BMI nieoptymalne" : "BMI optymalne";
    }

}
