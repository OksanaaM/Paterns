package paterns.Adaptor;

/**
 * Created by Оксана on 05.03.2016.
 */
public class McDonalldsAdapter extends McFoxy implements McDonallds {

    public Object takeHappyMeal() {
        return getChildrenMeal();
    }

    public Object takeBigMacMenu() {
        return getBurgerMenu();
    }

    public Object takeRoyalMenu() {
        return getChildrenMeal();
    }
}
