package test;

import menu.burger.Beef.BigMac;
import menu.menuDisplayed.Menu;
import menu.drink.Coke;
import org.junit.Before;
import org.junit.Test;
import ui.Order;

public class TestMenu {
    private Menu menu;
    Order order;
    Coke coke;
    BigMac bigMac;

    @Before
    public void setup(){
         order = new Order();
        menu = new Menu();
        coke = new Coke();
        bigMac = new BigMac();
        menu.addFood(coke);
        menu.addFood(bigMac);

    }

    @Test
    public void testGetFood(){
        System.out.println(menu.getFood(2).getName());
    }


}
