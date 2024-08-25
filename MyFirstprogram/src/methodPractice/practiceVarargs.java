package methodPractice;

public class practiceVarargs {
       static int showmax(int ...A) {
    	if(A.length ==0) 
    		return Integer.MIN_VALUE;
    	int max=A[0];
    	for(int i=1;i<A.length; i++) {
    		if(A[i]>max) 
    		 max=A[i];
    	
    		}
         return max;
    	}
//      static int sum(int ...A) {
//    	  int sum=0;
//    	  for(int i=0;i<A.length; i++) {
//    		  sum=sum+A[i];
//    	  }
//    	  return sum;
//      }
      static double sum(double ...P) {
    	  double sum=0;
    	  for(int i=0;i<P.length;i++) {
    		  sum+=P[i];	  
    	  }
    	  if(sum<500) {
    		 return sum*0.10;
    	  }
    	  else if(sum>=500 && sum<1000) {
    		  return sum*0.15;
    	  }
    	  else 
    		  return sum*0.20;
      
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	  System.out.println(showmax());
//      System.out.println(showmax(10,99));
		System.out.println(sum());
     System.out.println(sum(529,134));
      System.out.println(sum(459,599,1099));
	}

}
