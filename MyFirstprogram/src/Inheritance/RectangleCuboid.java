package Inheritance;

class Rectangle{
	int length;
	int breadth;
	int x=10;
	Rectangle(){
		length=breadth=1;
	}
	Rectangle(int l, int b){
		this.length=l;
		this.breadth=b;
	}
}
class Cuboid extends Rectangle{
	int height;
	int x=20;
	
	Cuboid(){
		height=1;
	}
	Cuboid(int h){
		height=h;
	}
	Cuboid(int l, int b, int h){
		super(l,b);
		height=h;
	}
	int volume() {
		return length*breadth*height;
	}
	void display() {
		System.out.println(super.x);
		System.out.println(x);
		
	}
}
public class RectangleCuboid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Cuboid c = new Cuboid(2,6,10);
    System.out.println(c.volume());
    c.display();
	}

}
