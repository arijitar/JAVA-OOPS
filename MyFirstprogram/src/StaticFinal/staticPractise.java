package StaticFinal;
class testing{
	 static {
	    	System.out.println("Block 1");
	    }
	 static {
	    	System.out.println("Block 2");
	    }
}
public class staticPractise {
    
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main");
		testing t1 = new testing();
		
	}
    
}
