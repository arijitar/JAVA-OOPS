package project01;

//import java.util.Scanner;

public class nestedloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //  nested loops = a loop  inside of a loop
//		Scanner scanner = new Scanner(System.in);
		int rows = 4;
		int coloms = 5;
		 
		
//		System.out.println("Enter the number of rows: ");
//		rows = scanner.nextInt();
//		
//		System.out.println("Enter the number of coloms: ");
//		coloms = scanner.nextInt();
		
		for(int i = 1; i<=rows; i++) {
			for(int j = 1; j<=coloms; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
