package com.company.ZaawJavaTrener.ZaawJavaTrener12_13;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CarService {

    private List<Car> carList = new ArrayList<>();

    public void addCar(Car car) {
        carList.add(car);
    }

    public void removeCar(Car car) {
        carList.remove(car);
    }

    public List<Car> getAllCar() {
        return new ArrayList<>(carList);
    }

    public List<Car> getCarWithV12() {
//        return carList.stream()
//                .filter(car -> car.getEngineType().equals(EngineType.V12))
//                .collect(Collectors.toList());
        return carList.stream()
                .filter(car -> car.getEngineType() == EngineType.V12)
                .collect(Collectors.toList());
    }

    public List<Car> getCarBefore1999() {
        return carList.stream()
                .filter(car -> car.getProductionYear() < 1999)
                .collect(Collectors.toList());
    }

    public Car getMostExpensive() {
        return carList.stream()
                .max((car1, car2) -> car1.getPrice().compareTo(car2.getPrice()))
                .get();
    }


    public Car getCheapest() {
        return carList.stream()
                .min((car1, car2) -> car1.getPrice().compareTo(car2.getPrice()))
                .get();
    }

    public List<Car> getWithAtLeast3Manufacturers() {
        return carList.stream()
                .filter(car -> car.getManufacturers().size() >=3)
                .collect(Collectors.toList());
    }

    public List<Car> getSorted(Sort sort) {
        if (sort.equals(Sort.ASC)) {
            return carList.stream()
                    .sorted((car1, car2) -> car1.getModel().compareTo(car2.getModel()))
                    .collect(Collectors.toList());
        } else if (sort.equals(Sort.DESC)) {
            return  carList.stream()
                    .sorted((car1, car2) -> car2.getModel().compareTo(car1.getModel()))
                    .collect(Collectors.toList());
        }
        throw new IllegalArgumentException("Permitted only asc and desc arguments");
    }

    public boolean containsModel (String model) {
        return carList.stream().anyMatch(car -> car.getModel().equals(model));
    }

    public List<Car> getByManufacturerName (String manufacturerName) {
        return carList.stream()
                .filter(car -> car.getManufacturers().stream().anyMatch(m -> m.getName().equals(manufacturerName)))
                .collect(Collectors.toList());
    }

    public List<Car> getCarsByManufacturerYear (int estimationYear, Cond condition) {
        return carList.stream()
                .filter(filterCondition(condition, estimationYear))
                .collect(Collectors.toList());
    }


    private Predicate<Car> filterCondition (Cond condition, int estimationYear) {
        if (condition == Cond.GREATER) {
            return car -> car.getManufacturers().stream().anyMatch(m -> m.getStartYear() > estimationYear);
        } else if (condition == Cond.LESS) {
            return car -> car.getManufacturers().stream().anyMatch(m -> m.getStartYear() < estimationYear);
        } else {
            return car -> car.getManufacturers().stream().anyMatch(m -> m.getStartYear() == estimationYear);
        }
    }

}
