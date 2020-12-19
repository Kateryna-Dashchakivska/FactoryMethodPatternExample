package org.example;

public class KiaSportageFactory implements CreateCars{

    private KiaSportage kiaSportage;

    public Car createACar(String color) {
        this.kiaSportage = new KiaSportage();
        this.kiaSportage.setColor(color);
        return kiaSportage;
    }
}
