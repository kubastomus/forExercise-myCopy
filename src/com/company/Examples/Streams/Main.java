package com.company.Examples.Streams;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> list = List.of("C", "D", "A", "G", "E");

//        Stream<String> lettersStream = list.stream();
//        Stream<String> sortedLettersStream = lettersStream.sorted();
//        sortedLettersStream.forEach(s -> System.out.println(s));

//        list.stream().sorted().forEach(s -> System.out.println(s)); // posortowany strumień z listy, krótsza wersja

//        list.stream().
//                sorted((s1, s2) -> s2.compareTo(s1)).
//                forEach(s -> System.out.println(s)); // posortowanie danych strumienia w kolejnosci malejącej


        List<Human> humans = List.of(
                new Human("Jan", "Kowalski", 50),
                new Human("Wiesław", "Nowak", 55),
                new Human("Adrian", "Wiśniewski", 30),
                new Human("Wojtuś", "Oszczudłowski", 3),
                new Human("Andrzej", "Dąbrowski", 35),
                new Human("Zenon", "Martinez", 51),
                new Human("Maciuś", "Dobrowolski", 6),
                new Human(null, null, 6)
        );


        // sortowanie strumieni obiektów z listy humans wg wieku
//        humans.stream()
//                .sorted((h1, h2) -> Integer.compare(h1.getAge(), h2.getAge()))
//                .forEach(h -> System.out.println(h));


        // posortujcie  wg nazwiska malejąco i wypiszcie do konsoli obiekty z listy humans
        // UWAGA wyskoczy błąd ponieważ ostati human na liście jest null w imieniu i nazwisku

//        humans.stream()
//                .sorted((h1, h2) -> h2.getLastName().compareTo(h1.getLastName()))
//                .forEach(h -> System.out.println(h));


        // sortowanie wg wieku poniżej 18 obiektów z listy humans
//        humans.stream()
//                .filter(h -> h.getAge() < 18)
//                .forEach(h -> System.out.println(h));


        // sortowanie wg wieku poniżej 18 obiektów z listy humans
        // UWAGA dodanie sortowania wg rosnących nazwisk, błąd z uwagi j/w na null w ostatnim obiekcie w liście
//        humans.stream()
//                .filter(h -> h.getAge() < 18)
//                .sorted((h1, h2) -> h1.getLastName().compareTo(h2.getLastName()))
//                .forEach(h -> System.out.println(h));


        // wypisz tych humanów których imię zaczyna się na literę 'W'
//        humans.stream()
//                .filter(h -> h.getFirstName() != null && h.getFirstName().startsWith("W"))
//                .filter(h -> "W".equals(h.getFirstName().substring(0, 1)))
//                .forEach(h -> System.out.println(h));

//        String[] names = {"adam", "wiesiek", "andrzej", "krzysztof"};
//
//        // wypisanie imion z tablicy za pomocą strumienia konwertując na duże litery
//        Arrays.stream(names)
//                .map(name -> name.toUpperCase())
//                .forEach(s -> System.out.println(s));

//        Stream<Human> humanStream = humans.stream();
//        Stream<String> lastNamesStream = humanStream.map(human -> human.getLastName());
//        lastNamesStream.forEach(s -> System.out.println(s));


        // prostszy zapis wyświetlenia po nazwisku tego samego co powyżej u góry
        humans.stream()
                .map(human -> human.getLastName())
                .forEach(lastName -> System.out.println(lastName));

        // napiszcie kod zwracający Streama Stringów gdzie każdy string to imie i nazwisko osoby
        // następnie wypiszcie zawartość streama do konsoli ZAMYKANIE PRZEZ COLLECTOR
        List<String> fullNamesStream = humans.stream()
                .map(human -> human.getFirstName() + " " + human.getLastName())
                .collect(Collectors.toList());

        for(String s: fullNamesStream){
            System.out.println(s);
        }


        // INNE podręcznikowe przykłady SORTED
        Arrays.asList(6, 3, 6, 21, 20, 1).stream()
                .sorted(Comparator.reverseOrder())
                .forEach(s -> System.out.println(s)); // w streamie znajdziemy: 21, 20, 6, 6, 3, 1 - w tej kolejności

        // FIND FIRST
        List.of("kto", "będzie", "pierwszym", "elementem").stream()
                .sorted()
                .findFirst() // zwraca Optional
                .ifPresent(System.out::println); // wyświetli słowo "będzie"


        System.out.println("------------zamykanie funkcjami mat----------");

        List<Car> cars = Arrays.asList(
                new Car("Audi A4", 130000 ),
                new Car("Skoda Fabia", 70000 ),
                new Car("Volkswagen Arteon", 180000 ));

        long count = cars.stream()
                .filter(car -> car.getPrice() > 100000)
                .count();
        System.out.println(count);

        int sum = cars.stream()
                .mapToInt(car -> car.getPrice())
                .sum();
        System.out.println(sum);

        int sum1 = cars.stream()
                .mapToInt(car -> car.getPrice())
                .min().getAsInt();
        System.out.println(sum1);

        double sum2 = cars.stream()
                .mapToInt(car -> car.getPrice())
                .average().getAsDouble();
        System.out.println(sum2);

    }
}
