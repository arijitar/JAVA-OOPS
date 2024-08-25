package classes;
class Super{
	int x=10;
	sub i = new sub();
	
	class sub{
		int y=20;
		public void subDisplay() {
			System.out.println(x+"\n"+y);		
			}
	}
	public void SuperDisplay() {
		sub i = new sub();
		i.subDisplay();
		System.out.println(i.y);
	}
}

public class Nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Super o = new Super();
         o.SuperDisplay();
        
         
	}

}
