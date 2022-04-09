package question22;

public class Test {

	public static void main(String[] args) {
		Car c = new Car();
		c.applyBrakes();
		c.capacity();
		c.fuelAmount();
		
		System.out.println("*************");
		Bus b = new Bus();
		b.applyBrakes();
		b.capacity();
		b.fuelAmount();
		
		System.out.println("*************");
		Truck t = new Truck();
		t.applyBrakes();
		t.capacity();
		t.fuelAmount();
	}
}
