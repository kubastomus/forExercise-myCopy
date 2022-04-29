package com.company.WzorceProjektowe.ChlidrenSingletonCount;

import java.util.Scanner;


public class ChildrenApp {
    public static void main(String[] args) {
        boolean isWorking = true;
        ChildrenRepository childrenRepository = new ChildrenRepositoryImpl();
        Scanner scanner = new Scanner(System.in);
        while (isWorking) {
            String text = scanner.nextLine();
            switch (text) {
                case "exit":
                    isWorking = false;
                    break;
                case "add":
                    String name = scanner.nextLine().toLowerCase().trim();
                    childrenRepository.addChild(name);
                    break;
                case "display":
                    System.out.println(childrenRepository.getChildren());
                    break;
                case "remove duplicates":
                    childrenRepository.removeDuplicates();
                    break;
                case "sort":
                    childrenRepository.sortChildren();
                    break;
                case "toLowerCase":
                    childrenRepository.setNameToLowerCase();
                    break;
                case "toUpperCase":
                    childrenRepository.setNameToUpperCase();
                    break;
                case "count":
                    System.out.println(SingletonChildrenCount.getInstance()
                            .getNumberOfInstances());
                    break;
            }
        }
    }
}