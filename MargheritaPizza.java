package lab9;

public class MargheritaPizza extends Pizza{

	public MargheritaPizza(int size, double price) {
		
		this.size = size;
		this.price = price;
	}
	public String toString() {
		
		return "Margherita " + this.size + " " + this.price;
	}
}
