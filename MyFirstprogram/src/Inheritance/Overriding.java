package Inheritance;

class Super{
	void display() {
		System.out.println("Super classes display");
	}
}
class Sub extends Super{
	void display() {
		System.out.println("Sub classes display");
	}
}
public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Super su = new Sub();
      su.display();
      
      Sub s = new Sub();
      s.display();
	}

}
