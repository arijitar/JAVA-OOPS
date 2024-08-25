package project01;

import java.util.Arrays;
public class increasesizeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int A[] = {8,6,10,9,2};
       
       int B[] = new int[10];
      
       System.out.println("Array length is: "+A.length);
          
      System.arraycopy(A,0,B,0,3);
       	 A=null;
       	 
       	 System.out.println("New array is: "+Arrays.toString(B));
        	System.out.println("New length is: "+B.length);
		    	   
	}

}
