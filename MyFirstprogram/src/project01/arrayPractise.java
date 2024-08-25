package project01;
//import java.util.Scanner;

public class arrayPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int A[] = {5,9,6,10,12,7,3,5,4,2}; 
        int n=1;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the key");
//        int key = scanner.nextInt();
//        
//        for(int i=0; i<A.length; i++) {
//        	if(key==A[i]) {
//        		System.out.println("Element found at index "+i);
//        		System.exit(0);
//        	}
//        }
//        System.out.println("Not found");
        
//        int max1 = A[0];
//        int max2 = A[0];
//        
//        for(int i=0; i<A.length; i++) {
//        	if(A[i]>max1) {
//        		max2 = max1;
//        		max1 = A[i];
//        	}
//        	else if(A[i]>max2) {
//        		max2 = A[i];
//        	}
//        }
//        System.out.println(max2);
       System.out.println("Original Array: ");
        for(int x:A) 
        	System.out.println(x+",");
        	System.out.println("");
        
        for(int i=0; i<n; i++) {
        	
        	
        	int temp = A[A.length-1];
        
        	
        
        for(int j=A.length-1; j>0; j--)
        {
        	
        	A[j]=A[j-1];
        	
        }
        	A[0]=temp;
     
        	System.out.println("Array after right rotation: ");
        	for(int x:A) 
            	System.out.println(x+",");
            	System.out.println("");
            
        
        }
	}
}
