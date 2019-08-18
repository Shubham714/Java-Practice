import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ExceptionPropogartion {
	void arrayOperation() throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a");
	    int a=Integer.parseInt(br.readLine());
		System.out.println("Enter b");
	    int b= Integer.parseInt(br.readLine());
	    System.out.println(a/b);
	}
	public static void main(String[] args) {
	ExceptionPropogartion ep=new ExceptionPropogartion();
	try {
		ep.arrayOperation();
		
	}
	catch(ArithmeticException e) {
		System.out.println("ArithmeticException:"+e.getMessage());
	}
	catch (IOException e) {
	   System.out.println("IO:"+e.getMessage());
	}
	}
}
