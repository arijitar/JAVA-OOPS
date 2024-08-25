package methodPractice;

public class MAXelementArr {
    static int maxArr() {
    	int A[]= {13,14,9,5,17};
    	int max = A[0];
    	for(int i=1;i<A.length;i++) {
    		if(A[i]>max) {
    			max=A[i];
    		}
    		
    	}
    	return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("maximum element is "+maxArr());
	}

}
