package paterns.abstractFactory;

/**
 * Created by Оксана on 07.03.2016.
 */
public class ColourFactory extends AbstactFactory {
    @Override
    Car getCar(String car) {
        return null;
    }

    Colour getColour(String colour){
        if (colour == null){
            return null;
        }
        if (colour.equalsIgnoreCase("RED")){
            return new Red();
        }
        if (colour.equalsIgnoreCase("BLACK")){
            return new Black();
        }
        if (colour.equalsIgnoreCase("WHITE")){
            return new White();
        }
        return null;
    }
}
