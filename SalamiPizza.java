package lab9;

public class SalamiPizza extends Pizza{

	public SalamiPizza(int size, double price) {
		
		this.size = size;
		this.price = price;
	}
	public String toString() {
		
		return "Salami " + this.size + " " + this.price;
	}
	
}
