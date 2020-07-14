package fundamentals.classes;

public class Product {

	String name;
	double price;
	static double discount = 0.25;
	
	Product() {
		
	}
	
	Product(String initialName, double initialPrice) {
		name = initialName;
		price = initialPrice;
	}
	
	double priceWithDiscount() {
		return price * (1 - discount);
	}

	double priceWithDiscount(double descontoDoGerente) {
		return price * (1 - discount + descontoDoGerente);
	}
}
