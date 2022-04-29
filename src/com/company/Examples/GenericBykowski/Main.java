package com.company.Examples.GenericBykowski;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Ship<Pirate> pirateShip = new Ship<>();
        pirateShip.add(new Pirate("Jan", "Nowak"));
        Pirate pirate = pirateShip.findBySurname("Nowak");
        System.out.println("damage " + pirate.cannonShot());

        Ship<Merchant> merchantShip = new Ship<>();
        merchantShip.add(new Merchant("Karol", "Wiśniewski"));
        Merchant merchant = merchantShip.findBySurname("Wiśniewski");
        List<Double> doubleList = Arrays.asList(2D, 3D, 4.4D);
        List<Number> numberList = Arrays.asList(2, 3, 5);

        // teraz może być zarówno double jak i number
        System.out.println("profit " + merchant.trande(doubleList));

    }
}
