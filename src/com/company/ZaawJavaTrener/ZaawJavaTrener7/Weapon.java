package com.company.ZaawJavaTrener.ZaawJavaTrener7;

import java.util.ArrayList;
import java.util.List;

public class Weapon {

    private List<String> list;
    private int sizeCapicity;

    public Weapon(int sizeCapicity) {
        this.sizeCapicity = sizeCapicity;
        list = new ArrayList<>();
    }

    public void loadBullet(String bullet){
        if (sizeCapicity > list.size()) {
            list.add(bullet);
        } else {
            System.out.println("Magazynek jest pełny");
        }
    }

    public boolean isLoaded(){
        return !list.isEmpty();
    }

    public void shot(){
        if(isLoaded()){
            int bulletIndex = list.size() - 1;
            System.out.println(list.get(bulletIndex));
            list.remove(bulletIndex);
        } else {
            System.out.println("Pusty magazynek");
        }
    }

}
