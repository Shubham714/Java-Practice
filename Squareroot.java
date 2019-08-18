import java.util.Scanner;
public class Squareroot {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		float sqrt=number/2;
		float temp=0;
		while(sqrt != temp)
		{
			temp=sqrt;
			System.out.println("Temp="+temp);
			sqrt=(number/temp+temp)/2;
			System.out.println("Sqrt="+sqrt+"\n");
		}
		System.out.print(sqrt);
		sc.close();
	}
}
