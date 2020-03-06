package lab9;

import lab9.Pizza.PizzaType;

public class PizzaFactory {

	private static PizzaFactory uniqueInstance;
	private PizzaFactory() {
		
	}
	public Pizza createPizza(String type, int size, double price) {
		
		Pizza pizza = null;
		if(type.equals(PizzaType.Salami.name()))
			pizza = new SalamiPizza(size, price);
		else if(type.equals(PizzaType.QuatroStagioni.name()))
			pizza = new QuatroStagioniPizza(size, price);
		else if(type.equals(PizzaType.Capriciosa.name()))
			pizza = new CapriciosaPizza(size, price);
		else if(type.equals(PizzaType.Margherita.name()))
			pizza = new MargheritaPizza(size, price);
		return pizza;
	}
	public static PizzaFactory getInstance() {
		
		if(uniqueInstance == null)
			uniqueInstance = new PizzaFactory();
		return uniqueInstance;
	}
}
