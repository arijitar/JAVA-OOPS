package Inheritance;
class hassedcar{
	public hassedcar() {
		System.out.println("Hassed Car");
	}
}
class ReadyCar extends hassedcar{
	public ReadyCar() {
		System.out.println("Car is now Ready");
	}
}
class Swift extends ReadyCar{
	public Swift() {
		System.out.println("Car is now called as Swift");
	}
}
class SwiftDezire extends Swift{
	public SwiftDezire() {
		System.out.println("Now the new car is SwiftDezire");
	}
}
public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    @SuppressWarnings("unused")
	SwiftDezire S = new SwiftDezire();
	}

}
