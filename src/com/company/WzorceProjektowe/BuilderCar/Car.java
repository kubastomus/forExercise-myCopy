package com.company.WzorceProjektowe.BuilderCar;

public class Car {

    private String engine;
    private boolean isElectric;
    private int vin;
    private String owner;
    private int maxSpeed;

    public Car() {
    }

    public String getEngine() {
        return engine;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public int getVin() {
        return vin;
    }

    public String getOwner() {
        return owner;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }


    public static class Builder{

        private String engine;
        private boolean isElectric;
        private int vin;
        private String owner;
        private int maxSpeed;

        public Builder (){

        }

        public Builder engine (String engine){
            this.engine = engine;
            return this;
        }

        public Builder isElectric (boolean isElectric){
            this.isElectric = isElectric;
            return this;
        }

        public Builder vin (int vin){
            this.vin = vin;
            return this;
        }

        public Builder owner (String owner){
            this.owner = owner;
            return this;
        }

        public Builder maxSpeed (int maxSpeed){
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Car build (){
            Car car = new Car();
            car.engine = this.engine;
            car.isElectric = this.isElectric;
            car.vin = this.vin;
            car.owner = this.owner;
            car.maxSpeed = this.maxSpeed;
            return car;
        }


    }
}
