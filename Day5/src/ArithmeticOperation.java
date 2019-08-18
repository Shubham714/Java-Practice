import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArithmeticOperation {	
	public static void main(String[] args) {
		String str = null;
	  try{	
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter first number:");int a=sc.nextInt();
		 System.out.println("Enter second number:");int b=sc.nextInt();
		 System.out.println("Division:"+(a/b));
		 
		 System.out.println("Length:"+str.length());
		 int arr[]= {10,20,23,40};
		 System.out.println("Addition:"+arr[3]+arr[4]);
	   }
	  catch(NullPointerException|ArithmeticException|ArrayIndexOutOfBoundsException e) {
		  System.out.println("Error:"+e.getMessage());
	  }
//	  catch(ArithmeticException e1) {
//		  System.out.println("ArithmeticException:"+e1.getMessage());
//	  }
//	  catch(ArrayIndexOutOfBoundsException e1) {
//		  System.out.println("ArrayIndexOutOfBoundsException:"+e1.getMessage());
//	  }
//	  catch(Exception e) {
//		  System.out.println("Exception:"+e.getMessage());
//	  }
	
    }
}
