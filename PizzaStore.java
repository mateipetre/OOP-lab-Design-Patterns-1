package lab9;
import java.util.*; 

public class PizzaStore {

	public PizzaStore() {
		
	}

	public static void main(String[] args) {

		Vector<Pizza> pizzaCollection = new Vector<>();
		PizzaFactory pizzaFactory = PizzaFactory.getInstance();
		Pizza pizza1 = pizzaFactory.createPizza("Salami", 12, 5.67);
		Pizza pizza2 = pizzaFactory.createPizza("QuatroStagioni", 10, 6.77);
		Pizza pizza3 = pizzaFactory.createPizza("Capriciosa", 8, 3.45);
		Pizza pizza4 = pizzaFactory.createPizza("Margherita", 10, 4.75);
	    pizzaCollection.add(pizza1);
	    pizzaCollection.add(pizza2);
	    pizzaCollection.add(pizza3);
	    pizzaCollection.add(pizza4);
	    System.out.println(pizzaCollection);
	}
	
}
