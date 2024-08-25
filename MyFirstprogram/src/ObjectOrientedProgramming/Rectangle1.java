package ObjectOrientedProgramming;

////class Rectangle{
////	private double length;
////	private double breadth;
//	
//	
//	public double getLength() {
//		return length;
//	}
//	public double getBreadth() {
//		return breadth;
//	}
//	public void setlength(double l) {
//		if(l>=0)
//		  length = l;
//		else
//		  length = 0;
//	}
//	public void setBreadth(double b) {
//		if(b>=0)  
//		 breadth = b;
//		else
//			breadth=0;
//	}
//	public double area() {
//		return getLength()*getBreadth();
//	}
//	public double perimeter() {
//		return 2*(length+breadth);
//		
//	}
//	public boolean isSquare() {
//		if(length == breadth) {
//			return true;
//		}
//		else 
//			return false;
//	}
//}
public class Rectangle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Rectangle r = new Rectangle();
//      Rectangle r2 = new Rectangle();
      
//      r1.length=10.5;
//      r1.breadth=5.5;
//      r2.length=12.5;
//      r2.breadth=0.5;
      
      r.setlength(10.5);
      r.setBreadth(5.5);
      
      System.out.println("Area: "+r.area());
      System.out.println("perimeter: "+r.perimeter());
      System.out.println("Square: "+r.isSquare());
      
//      System.out.println("Area: "+r2.area());
//      System.out.println("perimeter: "+r2.perimeter());
//      System.out.println("is it a Square: "+r2.isSquare());
      
      System.out.println("Length "+r.getLength());
      System.out.println("Breadth "+r.getBreadth());
	}

}
