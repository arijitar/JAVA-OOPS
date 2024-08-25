package project01;

import java.util.*;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int a;
		 int b;
		 int c;
		 @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		 System.out.println("enter the 1st number: ");
		 a = scanner.nextInt();
		 
		 System.out.println("enter the 2nd number: ");
		 b = scanner.nextInt();
		
		 c = Math.subtractExact(a, b) ;
		 System.out.println("the sum is: "+c);
	}

}
