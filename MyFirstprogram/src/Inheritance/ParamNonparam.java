package Inheritance;

class parent{
	   parent() {
		System.out.println("Non-parameter of parent");
	}
	public parent(int x) {
		System.out.println("parameter of parent "+x);
	}
}
class child extends parent{
	   child() {
		System.out.println("Non-parameter of child");
	}
	   child(int y) {
		System.out.println("parameter of child");
	}
	  child(int x, int y) {
		super(x);
		System.out.println("2 parameters of parent are:"+x+","+y);
	}
}
public class ParamNonparam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    @SuppressWarnings("unused")
	child c = new child(10, 20);
	}

}
