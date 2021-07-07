public class Bike {
	String model;
	float mileage;
	int price;

	public Bike (String model) {
		this.model = model;
		System.out.println("Created an object with model");
	}

	public Bike (String model, float mileage) {
		this.model = model;
		this.mileage = mileage;
		System.out.println("Created an object with model & mileage");
	}

	public Bike (String model, int price) {
		this.model = model;
		this.price = price;
		System.out.println("Created an object with model & price");
	}

	public Bike (String model, int price, float mileage) {
		this.model = model;
		this.price = price;
		this.mileage = mileage;
		System.out.println("Created an object with model, price & mileage");
	}

	public static void main(String[] args) {
		Bike bike1 = new Bike("Bajaj Pulsar"); 
		Bike bike2 = new Bike("Hero Splender", 60000, 80);
		Bike bike3 = new Bike("Honda Activa", 80000); // model & price
		Bike bike4 = new Bike("Suzuki Gixer", 40f); // model & mileage
	}
}

