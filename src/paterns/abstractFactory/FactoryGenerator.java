package paterns.abstractFactory;

/**
 * Created by Оксана on 07.03.2016.
 */
public class FactoryGenerator {
    public static AbstactFactory getFactory(String choice){
        if (choice.equalsIgnoreCase("CAR")){
            return new CarFactory();
        }else if(choice.equalsIgnoreCase("COLOUR")){
            return new ColourFactory();
        }
        return null;
    }
}
