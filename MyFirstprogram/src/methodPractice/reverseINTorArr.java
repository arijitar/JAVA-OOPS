package methodPractice;

public class reverseINTorArr {
	static int rev =0;
   static void reverse(int n) {
    	if (n <= 0) 
            return; 
        // remainder 
        int rem = n % 10; 
        rev = (rev * 10) + rem; 
        reverse(n / 10); 
    }
   static void reverse(int A[],int n){
	   int B[]=new int[n];
	   int j=n;
	   for(int i=0;i<A.length;i++) {
		   B[j-1]=A[i];
		   j--;
	   }
	   System.out.println("Resersed array is: ");
	   for(int k=0; k<B.length; k++) {
		   System.out.print(B[k]+",");
	   }
	  
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     int n = 4567;
//     reverse(n);
//     System.out.println("reverse num is :"+rev);
		
		int A[]= {4,5,6,3,8,1,9,2};
		reverse(A,A.length);
	}

}
