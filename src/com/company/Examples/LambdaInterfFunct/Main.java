package com.company.Examples.LambdaInterfFunct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

        Human g1 = new Human("Senior", "Gad", 63);
        Human g2 = new Human("Seniorita", "Gad", 60);
        Human g3 = new Human("Gargamel", "Gadzik", 40);
        Human g4 = new Human("Genowefa", "Gadzik", 35);

        List<Human> humans = new ArrayList<>(Arrays.asList(g1, g2, g3, g4));

        // zastępuje nazwisko z dużych liter
        humans.replaceAll(g -> {
            g.setLastName(g.getLastName().toUpperCase());
            return g;
        });

        // zmień wiek każdej osoby żeby była o 20 lat starsza
        humans.replaceAll(g -> {
            g.setAge(g.getAge() + 20);
            return g;
        });

//        humans.removeIf(g -> "S".equals(g.getFirstName().substring(0, 1)));  //wycina tzn usuwa humans które mają index FirstName "S" od 0 do 1
        humans.removeIf(g -> "Senior".equals(g.getFirstName())); // usuwa z listy human o wartości "Senior" dla FirstName


        // użyj w taki sposób metody removeIf aby w kolekcji pozostały tylko GADY full stare ;))
        humans.removeIf(g -> {
            return g.getAge() < 80;
        });


        humans.forEach(g -> System.out.println(g));


        // wypisz za pomocą metody forEach nazwisko oraz imię
        // każdej osoby
        // np. Kowalski Jan

        humans.forEach(g -> System.out.println(g.getLastName() + " " + g.getFirstName()));


        //poniżej praykłady z samouczka programisty na interfejcie checker, który też może być funkcyjny

        Checker<Integer> isOddAnonymous = new Checker<Integer>() {
            @Override
            public boolean check(Integer object) {
                return object % 2 == 0;
            }
        };

        System.out.println(isOddAnonymous.check(123));

        Checker<Integer> issOddLambda = object -> object % 2 == 0;

        System.out.println(issOddLambda.check(122));


        // kilka przykładów użycia interf funkcyjnych (chyba);

        UnaryOperator<Integer> square = x -> x * x;

        Supplier<String> someString = () -> "some return value";

        BiConsumer<Integer, Long> multiplier = (Integer x, Long y) -> System.out.println(x * y);

        Function<Integer, Long> multiline = x -> {
            if (x != null && x % 2 == 0) {
                return (long) x * x;
            } else {
                return 123L;
            }
        };


    }
}
