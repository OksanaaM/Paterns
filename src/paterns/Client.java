package paterns;

/**
 * Created by Оксана on 05.03.2016.
 */
public class Client {

    public static void eat(Object lunch){
        System.out.println("Bon Apetite");
    }

    public static void main(String[] args) {
        McDonallds fd = new McDonalldsAdapter();
        Object lunch = fd.takeHappyMeal();
        eat(lunch);
        lunch = fd.takeBigMacMenu();
        eat(lunch);
        lunch = fd.takeRoyalMenu();
        eat(lunch);


    }

}
