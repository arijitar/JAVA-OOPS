package practiseInterface;

interface Test{
	void method1();
	void method2();
	
}
  class My implements Test{
	public void method1() {
		System.out.println("Meth1 of class MY");
	}
	public void method2() {
		System.out.println("Meth2 of class MY");
	}
	
	public void method3() {
		System.out.println("Meth3 of class MY");
	}
	
}
public class InterfacePractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        My t = new My();
        t.method1();
        t.method2();
        t.method3();
	}

}
