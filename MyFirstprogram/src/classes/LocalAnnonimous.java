package classes;
class Outer{
	void Outerdisplay() {
		class inner{
			void innerdisplay() {
				System.out.println("hello");
			}
		}
		inner i = new inner();
		i.innerdisplay();
	}
}

interface MY{
	 void display();
}
class Outerclass{
	public void meth() {
	MY m = new MY() {
		public void display() {
			System.out.println("Hello");
		}
	};
	m.display();
  }
}

public class LocalAnnonimous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Outer o = new Outer();
       o.Outerdisplay();
       Outerclass ou = new Outerclass();
       ou.meth();
       
	}

}
