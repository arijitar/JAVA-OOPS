package project01;

public class DeleteElement {

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
	       
	       System.out.println("Original Array:");
	       for(int x:A) {
	    	   System.out.println(x+",");
	    	   System.out.println("");
	       }
	    
	    		@SuppressWarnings("unused")
				int count = 0;
	    		
	    	for(int i=0; i<A.length; i++) {
	    		if(A[i]==n) {
	    			count++;
	    			for(int j=i; j<A.length-1; j++ ) {
	    				A[j]=A[j+1];
	    			}
	    			i--;
	    		}
	    			
	    			}
	    			
	    		

	    	System.out.println("Array after deleting:");
		       for(int i=0; i<A.length; i++) {
		    	   System.out.println(A[i]+",");
		    	   System.out.println("");
		       }
	}

}
