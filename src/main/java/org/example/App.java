package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Start factory:" );

        CreateCars factory = new FordFiestaFactory();
        Car myCar = factory.createACar("Red");
        System.out.println( "Make: " + myCar.getMake() + " " + myCar.getModel() + " " + myCar.getEngineSize() + " " + myCar.getColor());

        CreateCars factory2 = new KiaSportageFactory();
        Car myCar2 = factory2.createACar("White");
        System.out.println( "Make: " + myCar2.getMake() + " " + myCar2.getModel() + " " + myCar2.getEngineSize() + " " + myCar2.getColor());

        System.out.println( "Cars are created!" );
    }
}
