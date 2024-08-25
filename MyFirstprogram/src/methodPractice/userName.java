package methodPractice;

public class userName {
static //      int max(int x, int y) {
//    	  return x>y?x:y;
//      }
//      
          String username(String email) {
    	  int a=email.indexOf('@');
    	  String name=email.substring(0,a);
    	  return name;
      }
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String email = "arijit@gmail.com";
		String name;
		name=username(email);
        
	
        System.out.println(name);
	}

}
