package Inheritance;

class Superclass{
	public void method1() {
		System.out.println("super Method1 is called");
	}
	public void method2() {
		System.out.println("method2 of Superclass is called");
		
	}
	
}
class Subclass extends Superclass{
	public void method2() {
		System.out.println("method2 of Subclass is called");
	}
	public void method3() {
		System.out.println("method3 of Subclass is called");
		
	}
}
public class DynamicDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Superclass s = new Subclass();
     s.method1();
     s.method2();
	}

}
