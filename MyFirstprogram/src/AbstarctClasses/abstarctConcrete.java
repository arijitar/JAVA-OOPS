package AbstarctClasses;

abstract class Super{
	Super(){
		System.out.println("Super constuctor");
	}
	public void meth1() {
		System.out.println("Meth1");
	}
	 abstract void meth2();
}
class Sub extends Super{
	public void meth2() {
		System.out.println("Sub Meth2");
	}
	public void meth3() {
		System.out.println("Meth3");
	}
	
}
public class abstarctConcrete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Super s = new Sub();
           s.meth1();
           s.meth2();
	}

}
