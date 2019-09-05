package test;

import menu.burger.Beef.BigMac;
import menu.menuDisplayed.Menu;
import menu.drink.Coke;
import org.junit.Before;
import org.junit.Test;
import ui.Order;

public class TestOrder {
    private Menu menu;
    Order order;
    Coke coke;
    BigMac bigMac;

    @Before
    public void setup(){
        menu = new Menu();
        coke = new Coke();
        bigMac = new BigMac();
        menu.addFood(coke);
        menu.addFood(bigMac);
        order = new Order();
    }

    @Test
    public void testOrder(){
         order.order(500,coke);
         order.printCurrentOrder();
    }
}

