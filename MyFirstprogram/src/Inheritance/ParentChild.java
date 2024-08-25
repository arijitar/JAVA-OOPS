package Inheritance;

class Parentclass{
	public Parentclass() {
	System.out.println("Parent Constructor");
		}
}
   class Childclass extends parent{
	public Childclass() {
		System.out.println("Child Constructor");
  }
}
class grandchild extends child{
	public grandchild() {
		System.out.println("Grandchild Constructor");
	}
}
public class ParentChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     @SuppressWarnings("unused")
	Childclass g = new Childclass();
      
	}

}
