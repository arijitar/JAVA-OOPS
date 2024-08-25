package AbstarctClasses;
abstract class shap{
	abstract double perimeter();
	abstract double area();

	
}
class Circle extends shap{
	int radius;
	public double area() {
		return Math.PI*radius*radius;
	}
	
	public double perimeter() {
		return 2*Math.PI*radius;
	}
	
	
}
class Rectangle extends shap{
	double length;
	double breadth;
	public double area() {
		return length*breadth;
	}
	public double perimeter() {
		return 2*(length+breadth);
	}
	
}
public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Rectangle r = new Rectangle();
        r.length=10;
        r.breadth=5;
        System.out.println(r.area());
        shap s = r;
        System.out.println(s.area());
	}

}
