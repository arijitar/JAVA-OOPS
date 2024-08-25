package practiseInterface;

class phone{
	public void call() {System.out.println("phone call");}
	public void Sms() {System.out.println("phone sending sms");}
}
interface iCamera{
	void click();
	void record();
}
interface iMusic{
	void play();
	void pause();
}
class Smartphone extends phone implements iCamera,iMusic{
	public void Videocall() {System.out.println("Smart phone Video callong");}
	public void click() {System.out.println("Smart phone clicking photo");}
	public void record() {System.out.println("Smart phone recording video");}
	public void play() {System.out.println("Smart phone playing Music");}
	public void pause() {System.out.println("Smart phone pausing Music");}
}
public class interfacesExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     iMusic sp = new Smartphone();
     sp.play();;
     sp.pause();
	}

}
