package paterns.abstractFactory;

/**
 * Created by Оксана on 07.03.2016.
 */
public class AbstractFactoryDemoProgram {
    public static void main(String[] args) {
        AbstactFactory carFactory = FactoryGenerator.getFactory("CAR");

        Car car1 = carFactory.getCar("HONDA");
        car1.drive();

        Car car2 = carFactory.getCar("TOYOTA");
        car2.drive();

        Car car3 = carFactory.getCar("BMV");
        car3.drive();

        AbstactFactory colourFactory = FactoryGenerator.getFactory("COLOUR");

        Colour color1 = colourFactory.getColour("RED");
        color1.paint();

        Colour colour2 = colourFactory.getColour("BLACK");
        colour2.paint();

        Colour colour3 = colourFactory.getColour("WHITE");
        colour3.paint();

    }
}
