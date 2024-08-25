package StaticFinal;

class Test{
	static int x =10;
	int y =20;
	
	void show() {
		System.out.println(x+"\n"+y);
	}
	static void display() {
		System.out.println(x);
	}
}

//class Hondacity{
//	static long price = 10;
//	int a,b;
//}
//static double onroadprice(String city) {
//	switch(city){
//		case "delhi": return price+price*0.1;
//		case "Mumbai": return price+price*0.09;
//	}
//}
public class Staticpractice {

//	@SuppressWarnings("static-access")
	@SuppressWarnings("static-access")
	public void main(String[] args) {
		// TODO Auto-generated method stub
     Test t1 = new Test();
     t1.show();
     t1.x=20;
     t1.y=50;
     Test t2 = new Test();
     t2.show();
	}

//		System.out.println(Hondacity.onroadprice("delhi"));
}
	
