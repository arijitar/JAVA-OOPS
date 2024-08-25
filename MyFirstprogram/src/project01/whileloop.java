package project01;

import java.util.Scanner;

public class whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			//while loop = executes a block of codes as long as it's Condition remains true
			
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			String name = "";
			
			do{
				System.out.println("Enter your name: ");
				name = scanner.nextLine();
				}while(name.isBlank()); 
			System.out.println("Hello "+name);
	
	}

}
