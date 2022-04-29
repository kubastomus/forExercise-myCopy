package com.company.ZaawJavaTrener.ZaawJavaTrener24_25;

public class Basket {

    private int counterBasket = 0;

    public void addToBasket() {
        if (counterBasket == 10){
            throw new BaskedFullException();
        }
        counterBasket++;
        System.out.println("Current elements amount: " + counterBasket);
    }

    public void removeFromBasket() {
        if (counterBasket == 0){
            throw new BaskedEmptyException();
        }
        counterBasket--;
        System.out.println("Current elements amount: " + counterBasket);
    }
}
