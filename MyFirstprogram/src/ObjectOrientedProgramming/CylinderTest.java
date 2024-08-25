package ObjectOrientedProgramming;

class Cylinder{
	private double radius;
	private double height;
	
	public Cylinder() {
		radius=0;
		height=0;
	}
	public Cylinder(int r) {
		radius=1;
	}
	public Cylinder(int r, int h) {
		setradius(r);
		setheight(h);
	}
	public double getradius() {
		return radius;
	}
	public double getheight() {
	      return height;
	}
	public void setradius(double r) {
		if(r>0)
			radius=r;
		else
			radius=0;
			
	}
	public void setheight(double h) {
		if(h>0)
			height=h;
		else
			height=0;
	}
	public double lidArea() {
		return Math.PI*radius*radius;
	}
	public double totalSurfaceArea() {
		return 2*lidArea()+circumference()*height;
	}
	public double circumference() {
		return 2*Math.PI*radius;
	}
	public double volume() {
		return lidArea()*height;
	}
}

public class CylinderTest  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Cylinder c = new Cylinder(10,5);
     
      
      System.out.println("lidArea: "+c.lidArea());
      System.out.println("TotalArea: "+c.totalSurfaceArea());
      System.out.println("Volume: "+c.volume());
      
	}

}
