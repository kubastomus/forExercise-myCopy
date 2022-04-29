package com.company.ZaawJavaTrener.ZaawJavaTrener7;

public class Main {
    public static void main(String[] args) {

        Weapon rifle = new Weapon(5);

        System.out.println(rifle.isLoaded());
        rifle.loadBullet("Odłamkowy");
        rifle.loadBullet("Przeciwpancerny");
        System.out.println(rifle.isLoaded());
        rifle.shot();
        System.out.println(rifle.isLoaded());

    }
}
