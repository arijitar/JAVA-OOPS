package project01;

public class ReversingArray {
     
	static void reverse(int A[], int n) {
		
		int B[]= new int[n];
		int j=n;
		for(int i=0; i<n; i++) {
			B[j-1] = A[i];
	        j = j-1;
		}
		System.out.println("Reversed array is: \n");
		for(int k=0; k<n; k++) {
			System.out.println(B[k]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int []A = {8,6,10,9,2,15,7,13,14,11};
             reverse(A,A.length);
	}

}
