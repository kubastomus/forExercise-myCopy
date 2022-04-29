package com.company.ZaawJavaTrener.ZaawJavaTrener4;

public class Main4 {
    public static void main(String[] args) {

        Storage storage = new Storage();

        storage.addStorage("1", "One");
        storage.addStorage("1", "Jeden");

        storage.displayValues("1");
        storage.displayValues("2");

        storage.addStorage("I", "Jeden");
        storage.displayKey("Jeden");

    }
}
