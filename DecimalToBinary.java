import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class DecimalToBinary {
	public static void main(String argc[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the decimal number=");
		int decimal=sc.nextInt();
		int rem;
		List<Integer> binary=new ArrayList<>();
		int i=0;
		while(decimal>0)
		{
			rem=decimal%2;
			binary.add(rem);
			decimal/=2;
			i++;
			
		}
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(binary.get(j));
		}
		sc.close();
	}
}
