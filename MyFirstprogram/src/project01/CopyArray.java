package project01;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int A[]= {8,6,10,9,2,15,7,13,14,11};
        int B[]=new int[10];
        
        System.out.println("Original Array: ");
        for(int i=0; i<A.length; i++) 
        	
        	 System.out.print(A[i]+",");
        System.out.println("");
             B=A;
        System.out.println("Copied Array: ");
        	 for(int i=0; i<B.length; i++) 
		    	   System.out.print(B[i]+",");
		    	   
        
       
	      
	}

}
