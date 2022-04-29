package com.company.ZaawJavaTrener.ZaawJavaTrener26_27;

import java.util.List;
import java.util.stream.Collectors;

public class Main26 {
    public static void main(String[] args) {

        Car myAudiA8 = new Car("A8", "My Audi A8", CarType.SEDAN);
        Car yourAudiA8 = new Car("A8", "Your Audi A8", CarType.SEDAN);
        Car audi3 = new Car("A3", "Audi A3", CarType.CABRIO);

        Model audiA8Model = new Model("Audi A8", 2004, List.of(myAudiA8, yourAudiA8));
        Model audiA3Model = new Model("Audi A3", 2001, List.of(audi3));
        Manufacturer manufacturer = new Manufacturer("Audi", 1950, List.of(audiA3Model, audiA8Model));

        Car myYaris = new Car("Yaris 1", "My Toyota Yaris", CarType.HATCHBACK);
        Car yoyrYaris = new Car("Yaris 2", "Your Toyota Yaris", CarType.HATCHBACK);
        Car chr = new Car("C-HR", "", CarType.HATCHBACK);

        Model toyotaYarisModel = new Model("Toyota Yaris", 1998, List.of(myYaris, yoyrYaris));
        Model toyotaChr = new Model("Toyota C-HR", 2015, List.of(chr));
        Manufacturer manufacturer1 = new Manufacturer("Toyota", 1961, List.of(toyotaChr, toyotaYarisModel));

        List<Manufacturer> manufacturers = List.of(manufacturer, manufacturer1);



        // lista wszystkich modeli
        System.out.println("lista wszystkich modeli>>>>");
        List<Model> models = manufacturers.stream()
                .flatMap(man -> man.getModels().stream())
                .collect(Collectors.toList());

        models.forEach(model -> System.out.println(model.getModel()));


        // listę wszystkich aut
        System.out.println("listę wszystkich aut>>>>");
        List<Car> cars = manufacturers.stream()
                .flatMap(man -> man.getModels().stream())
                .flatMap(car -> car.getCars().stream())
                .collect(Collectors.toList());

        cars.forEach(car -> System.out.println(car.getName()));

        // listę wszystkich nazw producentów
        System.out.println("listę wszystkich nazw producentów>>>>");
        List<String> manufacturerName = manufacturers.stream()
                .map(man -> man.getName())
                .collect(Collectors.toList());

        System.out.println(manufacturerName);

        // listę wszystkich lat założenia producentów
        System.out.println("listę wszystkich lat założenia producentów>>>>");

        List<Integer> manufacturerYear = manufacturers.stream()
                .map(man -> man.getYearOfCreation())
                .collect(Collectors.toList());

        System.out.println(manufacturerYear);

        // listę wszystkich nazw modeli
        System.out.println("listę wszystkich nazw modeli>>>>");

        List<String> modelsName = manufacturers.stream()
                .flatMap(model -> model.getModels().stream())
                .map(car -> car.getModel())
                .collect(Collectors.toList());

        System.out.println(modelsName);

        // listę wszystkich lat startu produkcji modeli
        System.out.println("listę wszystkich lat startu produkcji modeli>>>>");

        List<Integer> modelsYear = manufacturers.stream()
                .flatMap(model -> model.getModels().stream())
                .map(car -> car.getProductionStartYear())
                .collect(Collectors.toList());

        System.out.println(modelsYear);

        // listę wszystkich nazw aut
        System.out.println("listę wszystkich nazw aut>>>>");

        List<String> carNames = manufacturers.stream()
                .flatMap(model -> model.getModels().stream())
                .flatMap(car -> car.getCars().stream())
                .map(name -> name.getName())
                .collect(Collectors.toList());

        System.out.println(carNames);

        // listę wszystkich opisów aut
        System.out.println("listę wszystkich opisów aut>>>>");

        List<String> carDescrition = manufacturers.stream()
                .flatMap(model -> model.getModels().stream())
                .flatMap(car -> car.getCars().stream())
                .map(des -> des.getDescription())
                .collect(Collectors.toList());

        System.out.println(carDescrition);

        // tylko modele z parzystym rokiem startu produkcji
        System.out.println("tylko modele z parzystym rokiem startu produkcji>>>>");

        List<Model> evenModels = manufacturers.stream()
                .flatMap(model -> model.getModels().stream())
                .filter(car -> car.getProductionStartYear() % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenModels);

        // tylko auta producentów z parzystym rokiem założenia
        System.out.println("tylko auta producentów z parzystym rokiem założenia>>>>");

        List<Car> carsOfEvenManufacturers = manufacturers.stream()
                .filter(man -> man.getYearOfCreation() % 2 == 0)
                .flatMap(model -> model.getModels().stream())
                .flatMap(car -> car.getCars().stream())
                .collect(Collectors.toList());

        System.out.println(carsOfEvenManufacturers);

        // tylko auta z parzystym rokiem startu produkcji modelu oraz nieparzystym
        //rokiem założenia producenta
        System.out.println("tylko auta z parzystym rokiem startu produkcji modelu oraz nieparzystym \n" +
                "rokiem założenia producenta>>>>");

        List<Car> carListEvenStartOddCreation = manufacturers.stream()
                .filter(man -> man.getYearOfCreation() % 2 == 1)
                .flatMap(model -> model.getModels().stream())
                .filter(model -> model.getProductionStartYear() % 2 == 0)
                .flatMap(car -> car.getCars().stream())
                .collect(Collectors.toList());

        System.out.println(carListEvenStartOddCreation);

        // tylko auta typu CABRIO z nieparzystym rokiem startu podukcji modelu i
        //parzystym rokiem założenia producenta
        System.out.println("tylko auta typu CABRIO z nieparzystym rokiem startu podukcji modelu i \n" +
                "parzystym rokiem założenia producenta>>>>");

        List<Car> carListCabrio = manufacturers.stream()
                .filter(man -> man.getYearOfCreation() % 2 == 0)
                .flatMap(model -> model.getModels().stream())
                .filter(model -> model.getProductionStartYear() % 2 == 1)
                .flatMap(car -> car.getCars().stream())
                .filter(car -> car.getCarType().equals(CarType.CABRIO))
                .collect(Collectors.toList());

        System.out.println(carListCabrio);

    }
}
