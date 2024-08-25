package Exception;

import java.util.Scanner;

public class Trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a,b,c;
     @SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
     System.out.println("Enter 2 numbers");
     a=sc.nextInt();
     b=sc.nextInt();
     try {
    	 c=a/b;
         System.out.println("Division is "+c);
     }
     catch(ArithmeticException e){
    	 
    	 System.out.println("Denominetor shouldn't be 0,try again");
    	 
     }
     
     System.out.println("bye"); 
     
	}

}
