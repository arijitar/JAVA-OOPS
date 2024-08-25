package project01;

import java.util.Scanner;

public class Logioperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		logical operators = used to connect two or more expressions
//        && = And (Both condition must be true)
//        || = Or (either condition must be true)
//        ! = Not (reverses boolean value of condition)
		
//		int temp = 30;
//		
//		if(temp>30) {
//			System.out.println("It is high outside");
//		}
//		else if(temp>=20 && temp<=30){
//			System.out.println("It is warm outside");
//		}
//		else {
//			System.out.println("It is cold outside");
//		}
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("You are playing a game! press q or Q to quit");
		String button = scanner.nextLine();
		
		if(!button.equals("q") && !button.equals("Q")) {
			
			System.out.println("You are still playing the game *pubg*");
		}
		else {
			System.out.println("You quit the game");
		}
	}

}
