package project01;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//    Scanner scanner = new Scanner(System.in);
//    
//    System.out.println("what is your age: ");
//    
//    int age = scanner.nextInt();
//    
//    if(age==75) {
//    	System.out.println("ok Boomer!");
//    }
//    else if(age>=18) {
//    	System.out.println("Adult!");
//    }
//    else if(age>=13) {
//    	System.out.println("You are a teenager!");
//    }
//    else {
//    	System.out.println("you are not an Adult!");
//    }
		//Adult not adult case
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
//		
	   
//		
//		int number = scanner.nextInt();
//		
//		if(number>=18) {
//			System.out.println("Adult");
//		}
//		else {
//			System.out.println("Not adult");
//		}
	    // Odd even checking
//		int x = scanner.nextInt();
//		
//		if(x%2==0) {
//			System.out.println("Even");
//		}
//		else {
//			System.out.println("odd");
//		}
	    
	    int a;
	    int b;
	    
	    System.out.println("Enter the 1st number: ");
	    a = scanner.nextInt();
	    
	    System.out.println("Enter the 2nd number: ");
	    b = scanner.nextInt();
	    
	    if(a==b) {
	    	 System.out.println("Equal");
	    }
	    else if(a>b) {
	    	 System.out.println("a is greater");
	    }
	    else {
	    	 System.out.println("a is lesser");
	    }
	    }

}
