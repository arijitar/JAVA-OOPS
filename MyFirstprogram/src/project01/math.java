package project01;

import java.util.Scanner;
public class math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       double x = 3.14;
//       double y = 16;
//       
//		double z = Math.max(x, y);
//		double z = Math.min(x, y);
//		double z = Math.abs(x);
//		double z = Math.sqrt(x);
//		double z = Math.ceil(x);
//      double z = Math.floor(x);
//       
//       System.out.println(z);
		double x;
		double y;
		double z;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter side x: ");
		x = scanner.nextDouble();
		System.out.println("Enter side y: ");
		y = scanner.nextDouble();
		
		z = Math.sqrt((x*x)+(y*y));
		
		System.out.println("The hypotenous is: "+z);
		
		scanner.close();
	}

}
