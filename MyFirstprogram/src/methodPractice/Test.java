package methodPractice;

public class Test {
     static void update(int A[]) {
    	 A[0]=25;
    	 
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int A[]= {2,3,4,5,6};
        
        update(A);
        System.out.println(A[0]);
	}

}
