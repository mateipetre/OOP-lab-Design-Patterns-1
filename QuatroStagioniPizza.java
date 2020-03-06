package lab9;

public class QuatroStagioniPizza extends Pizza {

	public QuatroStagioniPizza(int size, double price) {
		
		this.size = size;
		this.price = price;
	}
	public String toString() {
		
		return "QuatroStagioni " + this.size + " " + this.price;
	}
}
