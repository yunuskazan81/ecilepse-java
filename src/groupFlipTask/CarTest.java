package groupFlipTask;

public class CarTest {

	public static void main(String[] args) {
		
		Car car;
		
		car =new Sedan("Red", 25000, 3000);
		double carPrice=car.calculateSalePrice();
		System.out.println("Sedan, "+car.color+", price is "+carPrice);
		
		car =new Truck("Black", 25000, 3000);
		double carPrice1=car.calculateSalePrice();
		System.out.println("Truck, "+car.color+", price is "+carPrice1);
	}
}
