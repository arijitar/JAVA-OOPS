package project01;

import java.util.Random;

public class randomnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Random random = new Random();
    
   @SuppressWarnings("unused")
int x = random.nextInt(6);
   double y = random.nextDouble();
   @SuppressWarnings("unused")
boolean z = random.nextBoolean();
    
    System.out.println(y);

	}

}
