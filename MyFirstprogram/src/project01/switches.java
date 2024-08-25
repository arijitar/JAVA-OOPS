package project01;

import java.util.Scanner;

public class switches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    @SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
    
    System.out.println("What's the day today?");
    
    String day = scanner.nextLine();
    
    switch(day) {
    case "Sunday": System.out.println("Wohh! It's sunday!");
    break;
    
    case "Monday":  System.out.println("It's Monday!");
    break;
    
    case "Tuesday":  System.out.println("It's Tuesday!");
    break;
    
    case "Wednesday":  System.out.println("It's Wednesday!");
    break;
    
    case "Thusday":  System.out.println("It's Thusday!");
    break;
    
    case "Friday":  System.out.println("It's Friday!");
    break;
    
    case "Saturday":  System.out.println("It's Saturday!");
    break;
    }
	}

}
