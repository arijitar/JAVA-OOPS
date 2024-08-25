package Inheritance;

class TV{
	public void switchOn() {
		System.out.println("TV is switched on");
	}
	public void changeChannel() {
		System.out.println("TV channel is changed");
	}
}
class smartTV extends TV{
	
	public void switchOn() {
		System.out.println("smartTV is switched on");
	}
	public void changeChannel() {
		System.out.println("smartTV channel is changed");
	}
	public void browse() {
		System.out.println("smart TV Browsing");
	}
}
public class MethodOverridingEX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV T = new smartTV();
        T.switchOn();
       T.changeChannel();
//         T.browse();
	}

}
