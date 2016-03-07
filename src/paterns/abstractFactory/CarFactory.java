package paterns.abstractFactory;

/**
 * Created by Оксана on 07.03.2016.
 */
public class CarFactory extends AbstactFactory {

    public Car getCar(String carModel) {
        if (carModel == null) {
            return null;
        }
        if (carModel.equalsIgnoreCase("HONDA")) {
            return new Honda();
        }
        if (carModel.equalsIgnoreCase("TOYOTA")) {
            return new Toyota();
        }
        if (carModel.equalsIgnoreCase("BMV")) {
            return new BMV();
        }
        return null;
    }

    @Override
    Colour getColour(String colour) {
        return null;
    }


}


