
public class CommandLineArgumentDemo {
  
	public static void main(String[] args) {
	
		for(String temp:args) {
			System.out.println(temp);
		}
		
		System.out.println("String element:"+args[0]+args[1]);
		int a=Integer.parseInt(args[0]);
	    int b=Integer.parseInt(args[1]);
	    System.out.println("Add=>"+(a+b));
	}
}
