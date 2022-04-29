package com.company.ZaawJavaTrener.ZaawJavaTrener18_19;

import java.util.Objects;

public class Computer {

    private String procesor;
    private String ram;
    private String graphicsCard;
    private String producer;
    private String model;

    public Computer(String procesor, String ram, String graphicsCard, String producer, String model) {
        this.procesor = procesor;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        this.producer = producer;
        this.model = model;
    }

    public String getProcesor() {
        return procesor;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(procesor, computer.procesor) && Objects.equals(ram, computer.ram) && Objects.equals(graphicsCard, computer.graphicsCard) && Objects.equals(producer, computer.producer) && Objects.equals(model, computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(procesor, ram, graphicsCard, producer, model);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "procesor='" + procesor + '\'' +
                ", ram='" + ram + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
