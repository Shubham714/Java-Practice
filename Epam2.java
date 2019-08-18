import java.util.Scanner;;
public class Epam2 {

	public static void main(String[] args) {
		System.out.println("Enter how many strings do you have=");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String data[]=new String[n];
		System.out.println("Enter Actual Strings=");
		for(int i=0;i<n;i++)
		{
			data[i]=sc.next();
		}
		int days=solve(data);
		System.out.println(days);
		sc.close();
	}

	private static int solve(String[] data) {
		String str;
		int count=0;
		int maxcount=0;
		for(int i=0;i<data.length;i++)
		{
			str=data[i];
			int j;
			for(j=0;j<str.length();j++)
			{
				if(str.charAt(j)=='N')
				{
					break;
				}
			}
			if(j==str.length())
			{
				count=count+1;
			}
			else
			{
				count=0;
			}
			if(maxcount<count)
			{
				maxcount=count;
			}
		}
		return maxcount;
	}

}
