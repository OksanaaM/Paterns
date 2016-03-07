package paterns.Adaptor;

/**
 * Created by Оксана on 05.03.2016.
 */
public class McFoxy {
    public Object getChildrenMeal(){
        Menu order = new Menu();
        order.setPrice(40);
        order.setSizeBurger("Big");
        order.setSizeCola("Small");
        order.setToy(true);
        return order;
    }
    public Object getBurgerMenu(){
        Menu order = new Menu();
        order.setPrice(50);
        order.setSizeBurger("Big");
        order.setSizeCola("Big");
        order.setToy(false);
        return order;
    }
    public Object getChickenMenu(){
        Menu order = new Menu();
        order.setPrice(45);
        order.setSizeBurger("Small");
        order.setSizeCola("Big");
        order.setToy(false);
        return order;
    }
}
