package methodPractice;

public class MethodPractice {
      int max(int x, int y) {
    	   if(x>y)
    		   return x;
    	   else
    		   return y;
       }
//	static void inc(int x) {
//		x++;
//		System.out.println(x);
//	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=10;
        int b=8;
        
//        inc(a);
//        System.out.println(a);
        
        
//        System.out.println(max(a,b)+" is maximum");   
        MethodPractice mp = new MethodPractice();
        System.out.println(mp.max(a, b)+" is maximum");
	}

} 
