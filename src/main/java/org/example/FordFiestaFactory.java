package org.example;

public class FordFiestaFactory implements CreateCars{

    private FordFiesta fordFiesta;

    public Car createACar(String color){
        this.fordFiesta = new FordFiesta();
        this.fordFiesta.setColor(color);
        return fordFiesta;
    }
}
