package methodPractice;

public class calculateArea {
    static double Area(double x, double y) {
    	return x*y;
    }
    static double Area(double radius) {
    	return Math.PI* radius* radius;
    }
    static double Area(double a, double b,double h) {
    	return 0.5*(a+b)*h;
    }
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(Area(2,7,9));
	}

}
