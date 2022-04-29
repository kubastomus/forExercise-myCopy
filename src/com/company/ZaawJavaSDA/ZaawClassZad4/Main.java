package com.company.ZaawJavaSDA.ZaawClassZad4;

public class Main {
    public static void main(String[] args) {

        User user = new User();

        user.setName("Janek", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input != null && !input.isEmpty() &&
                        Character.isUpperCase(input.charAt(0));
            }
        });

        user.setLastName("Kowal", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input != null && !input.isEmpty() &&
                        Character.isUpperCase(input.charAt(0));
            }
        });

        user.setAge(21, new Validator<Integer>() {
            @Override
            public boolean validate(Integer input) {
                return input >= 0 && input <= 150;
            }
        });

        user.setLogin("test kitek", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input.length() == 10;
            }
        });

        user.setPassword("!ketok", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input.contains("!");
            }
        });

        System.out.println(user);
    }
}
