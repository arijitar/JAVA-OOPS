package Inheritance;
class carHonda{
	public void start() {
		System.out.println("Honda Car is starting ");
	}
	public void accelarate() {
		System.out.println("Car is accelarating");
	}
	public void changeGear() {
		System.out.println("Gear is manual");
	}
}

class LuxaryHonda extends carHonda{
	public void start() {
		System.out.println("Luxary Honda Car is starting ");
	}
	public void accelarate() {
		System.out.println("Luxary Car is accelarating");
	}
	public void changeGear() {
		System.out.println("Gear is Automatic");
	}
	public void sunRoof() {
		System.out.println("SunRoof is opening");
	}
}
public class MethodOverridingEX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     carHonda c =new LuxaryHonda();
     c.start();
     c.changeGear();
     c.accelarate();
//     c.sunRoof();
	}

}
