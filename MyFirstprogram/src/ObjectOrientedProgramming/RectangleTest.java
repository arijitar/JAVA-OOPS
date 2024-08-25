package ObjectOrientedProgramming;

class Rectangle{
	private double length;
	private double breadth;
	
	public Rectangle() {
		length=1;
		breadth=1;
	}
	public Rectangle(double l, double b) {
		setlength(l);
		setBreadth(b);
	}
	public double getLength() {
		return length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setlength(double l) {
		if(l>=0)
		  length = l;
		else
		  length = 0;
	}
	public void setBreadth(double b) {
		if(b>=0)  
		 breadth = b;
		else
			breadth=0;
	}
	public double area() {
		return getLength()*getBreadth();
	}
	public double perimeter() {
		return 2*(length+breadth);
		
	}
	public boolean isSquare() {
		if(length == breadth) {
			return true;
		}
		else 
			return false;
	}
}

public class RectangleTest {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Rectangle r = new Rectangle(10,5);
      System.out.println("Area: "+r.area());
      System.out.println("perimeter: "+r.perimeter());
      System.out.println("Square: "+r.isSquare());
	}

}
