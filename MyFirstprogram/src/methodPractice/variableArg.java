package methodPractice;

public class variableArg {
	//int x is a mandatory argument and int ...x is a elipsey/variable argument parameter
   static void show(int ...x) {
    	for(int a:x) {
    		System.out.printf(a+",");
    	}
    }
   
   static void showList(int start, String ...s) {
	   for(int i=0; i<s.length; i++) {
		   System.out.println(start+1+"."+s[i]);
		   start++;
	   }
   }
	public static void main(String ...args) {
		// TODO Auto-generated method stub
//        show();
//		show(10,20,40);
//		show(10,20,30,40);
//		show(new int[] {10,20,30,40});
		
		showList(5,"john","Arun","Arvind","Raju");
	}

}
