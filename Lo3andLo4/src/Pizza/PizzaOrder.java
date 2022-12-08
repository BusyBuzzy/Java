package Pizza;
	public class PizzaOrder {

		private int numPizzas;
		private Pizza pizzaA;
		private Pizza pizzaB;
		private Pizza pizzaC;
		
		public PizzaOrder()
		{
			this.numPizzas = 0;
			this.pizzaA = null;
			this.pizzaB = null;
			this.pizzaC = null;
		}
		
		public PizzaOrder(int numPizzas, Pizza pizzaA, 
								Pizza pizzaB, Pizza pizzaC)
		{
			setNumPizzas(numPizzas);
			setPizza1(pizzaA);
			setPizza2(pizzaB);
			setPizza3(pizzaC);
		}

		public void setNumPizzas(int numPizzas)
		{		
			if(numPizzas < 1)
				this.numPizzas = 1;
			else if(numPizzas > 3)
				this.numPizzas = 3;
			else
				this.numPizzas = numPizzas;
		}

		public void setPizza1(Pizza pizza1)
		{
			if(numPizzas >= 1)
				this.pizzaA = pizza1;
			else
				this.pizzaA = null;
		}

		public void setPizza2(Pizza pizza2)
		{
			if(numPizzas >= 2)
				this.pizzaB = pizza2;
			else
				this.pizzaB = null;
		}

		public void setPizza3(Pizza pizza3)
		{
			if(numPizzas >= 3)
				this.pizzaC = pizza3;
			else
				this.pizzaC = null;
		}
		
		public double calcTotal()
		{
			double total = 0.0;
			
			if(pizzaA != null)
				total += pizzaA.calcCost();
			
			if(pizzaB != null)
				total += pizzaB.calcCost();
			
			if(pizzaC != null)
				total += pizzaC.calcCost();
			
			return total;
		}	
	}
		
	

