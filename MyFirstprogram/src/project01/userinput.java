package project01;

import java.util.Scanner;

public class userinput {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is ur name?");
		String name = sc.nextLine();
		
		System.out.println("How old are you?");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("What is your fav food?");
		String food = sc.nextLine();
		
		
		System.out.println("What is your mom's age?");
		int Age = sc.nextInt();
		
		
		System.out.println("Hello "+name);
		System.out.println("your are "+age+" years old");
		System.out.println("You like "+food);
		System.out.println("your mom is "+Age+" years old");
		
	}

}
