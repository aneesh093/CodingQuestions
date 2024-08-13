package designpatterns;
/**
 * 
 * @author Aneesh.Mathai
 * 
 * Decorator Design Pattern is used to add new things to an object without changing how it looks or works.
 */
public class DecoratorDesignPattern {

	public static void main(String[] args) {
		Car basicCar = new BaseModel();
		basicCar.assemble();

		Car sportsCar = new SportsCarDecorator(new BaseModel());
		sportsCar.assemble();
	}
}

interface Car {
	void assemble();
}

class BaseModel implements Car {
	@Override
	public void assemble() {
		System.out.println("Basic Car Model Assembled");
	}
}

class CarDecorator implements Car {

	protected Car car;
	CarDecorator(Car cr) {
		this.car = cr;
	}

	@Override
	public void assemble() {
		car.assemble();
	}
}

class SportsCarDecorator extends CarDecorator {

	SportsCarDecorator(Car cr) {
		super(cr);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding features of Sports Car.");
	}

}