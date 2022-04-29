package com.company.ZaawJavaTrener.ZaawJavaTrener24_25;

public class Main {
    public static void main(String[] args) {

        try {                           // w zad 25 występuje dopisanie try catch z e.printStackTrace();
            Basket basket = new Basket();

            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.removeFromBasket();
        } catch (BaskedEmptyException | BaskedFullException e){
            e.printStackTrace();
        }

    }
}
