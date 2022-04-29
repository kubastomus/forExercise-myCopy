package com.company.ZaawJavaSDA.ZaawClassZad3;

public class Car {

    private String vehicleBrand;
    private String type;
    private Engine engine;

    public Car(String vehicleBrand, String type) {
        this.vehicleBrand = vehicleBrand;
        this.type = type;
        this.engine = new Car.Engine(); // odnosimy się do obiektu klasy po klasie ??
        this.engine.setEngine(type);   // ustawiamy rodzaj silnika poprzez metodę w class Engine
    }

    public String getVehicleBrand() {
        return vehicleBrand;
    }

    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vehicleBrand='" + vehicleBrand + '\'' +
                ", type='" + type + '\'' +
                ", engine=" + engine +
                '}';
    }


    class Engine{
        private String engineType;

        public void setEngine(String type){

            switch (type){
                case "economy":
                    engineType = "diesel";
                    break;
                case "luxury":
                    engineType = "electric";
                    break;
                default:
                    engineType = "pertol";
                    break;
            }
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "engineType='" + engineType + '\'' +
                    '}';
        }
    }
}
