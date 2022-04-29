package com.company.ZaawJavaTrener.ZaawJavaTrener12_13;

import java.math.BigDecimal;
import java.util.List;

public class Main12_13 {
    public static void main(String[] args) {

        Manufacturer manufacturer1 = new Manufacturer("Volkswagen NordGermany", 1930, "Germany");
        Manufacturer manufacturer2 = new Manufacturer("Volkswagen SouthGermany", 1939, "Germany");
        Manufacturer manufacturer3 = new Manufacturer("Volkswagen Hamburg", 1950, "Germany");

        Manufacturer skoda = new Manufacturer("Skoda Car", 1948, "Czech Republic");

        Car passeratti = new Car("Volkswagen",
                "Passeratti",
                1997,
                new BigDecimal(1000),
                List.of(manufacturer1, manufacturer2, manufacturer3),
                EngineType.TDI);

        Car arteon = new Car("Volkswagen",
                "Arteon",
                2019,
                new BigDecimal(120000),
                List.of(manufacturer1, manufacturer2),
                EngineType.V8);

        Car fabia = new Car("Skoda",
                "Fabida",
                2018,
                new BigDecimal(60000),
                List.of(skoda),
                EngineType.R3);

        CarService carService = new CarService();

        carService.addCar(passeratti);                  // dodajemy auta do Car Service
        carService.addCar(arteon);
        carService.addCar(fabia);

//        carService.removeCar(passeratti);                       // Usuwa auta

//        System.out.print(carService.getAllCar());               // lista wszystkich aut

//        System.out.println(carService.getCarBefore1999());      // zwraca auta sprzed 1999

//        System.out.println(carService.getMostExpensive());      // zwraca najdroższe auto

//        System.out.println(carService.getCheapest());           // zwraca najtańsze auto

//        System.out.println(carService.getWithAtLeast3Manufacturers());      // zwraca auta produkowane w 3 fabrykach

//        System.out.println(carService.getSorted(Sort.DESC));        // sortuje modele aut malejąco/rosnąco

//        System.out.println(carService.containsModel("Arteon"));     // sprawdza czy model auta występuje w car service
//        System.out.println(carService.containsModel("Golf"));

//        System.out.println(carService.getByManufacturerName("Volkswagen Hamburg"));     // zwraca listę aut danej fabryki

        System.out.println(carService.getCarsByManufacturerYear(1950, Cond.EQUAL));

    }
}
