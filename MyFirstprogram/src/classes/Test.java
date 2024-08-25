package classes;

class Suter{
	int x=10;
	
	class inner{
		int y=20;
		void innerdisplay() {
			System.out.println(x);
			System.out.println(y);
		}
	}
	void Suterdisplay() {
		inner i = new inner();
		i.innerdisplay();
		System.out.println(i.y);
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     Outer o = new Outer();
//      o.Suterdisplay();
//      Outer.inner oi = new Outer().new inner();
//      oi.innerdisplay();
	}

}
