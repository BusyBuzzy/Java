package Pizza;

import java.util.Scanner;

public class Pizza {
	private String size;
	private int cheesetoppings,pepperonitoppings,hamtoppings;
	int price;
	public Pizza(String s, int a, int b, int c) {
		this.size=s;
		getTopping();
	}
	private void getTopping() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of cheese Topping: ");
		cheesetoppings=sc.nextInt();
		System.out.println("Enter a number of pepperoni topping: ");
		pepperonitoppings =sc.nextInt();
		System.out.println("Enter a number of ham topping: ");
		hamtoppings=sc.nextInt();
		
	}

	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public double calcCost() {
		if(size.equals("small")) {
			price= 10+2*(cheesetoppings+pepperonitoppings+hamtoppings);
		}else if(size.equals("medium")) {
			price=12+2*(cheesetoppings+pepperonitoppings+hamtoppings);
		}else {
			price=14+2*(cheesetoppings+pepperonitoppings+hamtoppings);
		}
		return price;
	}
	public String getDescription() {
		return "Pizza Size                 :"+size+
				"\nNumber of Cheese Topping   :"+cheesetoppings+
				"\nNumber of pepperoni Topping:"+pepperonitoppings+
				"\nNumber of Ham Topping      :"+hamtoppings;
	}
}
