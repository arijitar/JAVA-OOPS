package project01;
import java.util.Arrays;
public class SortingarrayofStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String arr[]= {"java","python","pascal","smalltalk","ada","basic"};
      
      Arrays.sort(arr);
      
      for(String x:arr) {
    	  System.out.print(x+",");
      }
	}

}
