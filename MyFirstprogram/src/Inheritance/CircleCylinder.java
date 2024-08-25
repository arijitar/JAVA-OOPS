package Inheritance;

class circle{
	public double radius;

   public double area() {
	   return Math.PI*radius*radius;
   }
   public double perimeter() {
	   return 2*Math.PI*radius;
   }
   public double circumference() {
	   return perimeter();
   }
} 
   class Cylinder extends circle{
	   public double height;
	   
	   public double volume() {
		   return area()*height;
	   }
   }
public class CircleCylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Cylinder c = new Cylinder();
       
       c.radius=7;
       c.height=10;
       
       System.out.println("Volume:"+c.volume());
       System.out.println("Area:"+c.area());
	}

}
