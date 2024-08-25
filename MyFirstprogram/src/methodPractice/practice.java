package methodPractice;

public class practice {
	static void change (int X[],int index,int value ) {
		X[index]=value;
	}
static void change2(int x, int value) {
	x=value;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int A[]= {2,4,6,5,9};
        
        change(A,2,20);
        for(int X:A)
        System.out.print(X+",");
        System.out.println("");
        
        int x=10;
        change2(x,20);
        System.out.println("value of primitive "+x);
	}

}
