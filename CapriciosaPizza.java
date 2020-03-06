package lab9;

public class CapriciosaPizza extends Pizza{

	public CapriciosaPizza(int size, double price) {
		
		this.size = size;
		this.price = price;
	}
	public String toString() {
		
		return "Capriciosa " + this.size + " " + this.price;
	}
}
