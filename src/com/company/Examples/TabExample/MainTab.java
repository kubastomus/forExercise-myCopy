package com.company.Examples.TabExample;

public class MainTab {
    public static void main(String[] args) {

        int [] number = new int[5];
// int [] cyfra = new int[]{45, 64, 3, 24}; // mozna tak
        number[0] = 1;
        number[1] = 8;
        number[2] = 135;
        number[3] = 55;
        number[4] = 30;
        for (int x : number) {
            System.out.print(x + " ");
        }
        System.out.println();


        int max = number[0], min = number[0];
        for (int x : number){
            if (max < x){
                max = x;
            }
            else if (min > x){
                min = x;
            }
        }

        System.out.println("Wartość minimalna: " + min + " Wartość maksymalna: " + max);


        int [] posortowana = new int[number.length];

        int minimalna;
        int n = 0;

        while (n < number.length){

            minimalna = number[n];

            for (int i = n; i < number.length; i++){
                if (minimalna > number[i]){
                    minimalna = number[i];
                    number[i] = number[n];
                    number[n] = minimalna;
                }
            }
            n++;
        }
        for (int s : number){
            System.out.print(s + " ");
        }


        System.out.println();

        String [][] people = new String[5][5];
        people[0] = new String[]{"Adam", "Filip"};
        people[1] = new String[] {"Kowalski", "Nowak"};
        System.out.println(people[0][1]);

        for (int i = 0; i < people.length; i++) {
            for (int j = 0; j < people[i].length; j++) {
                System.out.print(people[i][j] + " ");
            }
            System.out.println();
        }

    }
}