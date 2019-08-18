import java.util.Scanner;
public class BinaryToDecimal {
	public static void main(String argc[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the binary number=");
		long binary=sc.nextLong();
		int rem,decimal=0,i=0;
		while(binary>0)
		{
			rem=(int)binary%10;
			decimal+=rem*Math.pow(2, i);
			binary/=10;
			i++;
		}
		System.out.println("decimal="+decimal);
	sc.close();	
	}
}
