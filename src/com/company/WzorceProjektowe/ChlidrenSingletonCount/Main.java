package com.company.WzorceProjektowe.ChlidrenSingletonCount;

public class Main {

    public static void main(String[] args) {

        ChildrenRepository childrenRepository = new ChildrenRepositoryImpl();
        childrenRepository.addChild("Przemek");
        childrenRepository.addChild("anna");
        System.out.println(childrenRepository.getChildren());

        childrenRepository.getChildren().clear();

//        childrenRepository.sortChildren();
//        System.out.println(childrenRepository.getChildren());

        childrenRepository.addChild("anna");
        System.out.println(childrenRepository.getChildren());
        childrenRepository.removeDuplicates();
        System.out.println(childrenRepository.getChildren());

        childrenRepository.setNameToUpperCase();
        System.out.println(childrenRepository.getChildren());

    }
}