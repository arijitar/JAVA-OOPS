package project01;

public class Insertelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int A[] = new int[10];
       A[0]=5;
       A[1]=9;
       A[2]=6;
       A[3]=10;
       A[4]=12;
       A[5]=7;
       int n=6;
       
       System.out.println("Original Array is:");
       for(int i=0; i<n; i++) {
    	   System.out.print(A[i]+",");
    	   
       }
       System.out.println("");
       int x=20;
       int index = 2;
       for(int j=n; j>index; j--) {
    	   A[j] = A[j-1];
       }
       A[index] = x; 
       
       System.out.println("Array after inserting:");
       for(int i=0; i<n; i++) {
    	   
    	   System.out.print(A[i]+",");
    
       }
       System.out.println("");
       
	}

}
