package Pizza;

import java.util.Scanner;

public class PizzaTest {
	public static void main(String[] args) {
		
		Pizza p1=new Pizza("small", 0, 0, 0); 
		String result=p1.getDescription();
		System.out.println(result); double cost=p1.calcCost();
		System.out.println("Total Price :"+ cost);		
		Pizza pizza1 = new Pizza("large", 1, 0, 1);
		Pizza pizza2 = new Pizza("medium", 2, 2, 0);
		PizzaOrder order = new PizzaOrder();
		order.setNumPizzas(2);
		order.setPizza1(pizza1);
		order.setPizza2(pizza2);
		double total = order.calcTotal();
		
		System.out.println(pizza1.getDescription());
		System.out.println(pizza2.getDescription());
		System.out.println("Total cost: $" + total);
		
	}
}
