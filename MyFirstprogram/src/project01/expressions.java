package project01;

import java.util.Scanner;

public class expressions {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
	  
		System.out.println("how many friends u have?");
		double friends = scanner.nextDouble();
		friends = friends / 3;
		
		System.out.println("you have "+friends+" friends");
	}

}
      