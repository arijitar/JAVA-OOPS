package Exception;

public class Nestedcatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int A[]= {30,20,10,40,0};
     try {
     int c=A[0]/A[4];
     System.out.println("Division is: "+c);
     try {
     System.out.println(A[5]);
     }
     
     catch(ArrayIndexOutOfBoundsException e) {
    	 System.out.println("Index is invalid");
     }
     }
     catch(ArithmeticException e) {
     System.out.println("Denomiantor shouldn't be 0");
	}
     System.out.println("bye");

	}
}
