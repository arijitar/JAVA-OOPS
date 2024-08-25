package methodPractice;

public class GCD {
     static int gcd(int m, int n) {
    	 while(m!=n) {
    		 if(m>n) {
    			 m=m-n;
    		 }
    		 else
    			 n=n-m;
    	 }
    	 return m;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("GCD is: "+gcd(25,15));
	}

}
