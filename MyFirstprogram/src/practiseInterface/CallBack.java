package practiseInterface;

interface Member{
	public void callback();
}

class Store{
	Member mem[]=new Member[10];
	int count = 0;
	
	void register(Member m) {
		mem[count++]=m;
	}
	void inviteSale(){
		for(int i=0;i<count; i++) {
			mem[i].callback();
		}
	}
}
class Customer implements Member{
	String name;
	Customer(String n){
		name=n;
	}
	public void callback() {
		System.out.println("Please visit our store sir!"+name);
	}
}

public class CallBack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Store s = new Store();
       Customer c1 = new Customer("John");
    
	   Customer c2 = new Customer("Smith");
       Customer c3 = new Customer("Rick");
       s.register(c1);
       s.register(c3);
       s.inviteSale();
	}

}
