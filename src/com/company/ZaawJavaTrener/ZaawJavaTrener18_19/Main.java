package com.company.ZaawJavaTrener.ZaawJavaTrener18_19;

public class Main {
    public static void main(String[] args) {

        Computer computer1 = new Computer("iCore5", "8GB", "Raedon 1GB", "Intel", "Pentium 10");

        System.out.println(computer1.getGraphicsCard());
        System.out.println(computer1);

        Laptop HP1 = new Laptop("iCore7", "10GB", "NVIDIA 2GB", "HP mocar", "Pentium Full", 40000);

        System.out.println(HP1.getProducer());
        System.out.println(HP1);


    }
}
