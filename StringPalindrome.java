import java.util.Scanner;
public class StringPalindrome {
	public static void main(String args[])
	{
		System.out.print("Enter the string=");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int length=0;
		char[] arr=str.toCharArray();
		for(char c:arr)
		{
			length++;
		}
		System.out.println(length);
		sc.close();
	}
}
