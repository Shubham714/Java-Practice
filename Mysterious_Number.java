import java.util.Arrays;
import java.util.Scanner;

public class Mysterious_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter four digit Number-");
		int original=sc.nextInt();
		int count=calculatecount(original);
		System.out.println("The iterations to get number 6174 is "+count);
		
		sc.close();
	}

	private static int calculatecount(int original) {
		int count=0;
		int temp=original;
		if(temp==6174)
		{
			return count;
		}
		else
		{
			while (temp!=6174)
			{
				count++;
				int arr[]=intoarr(temp);
				Arrays.sort(arr);
				int num1=(arr[0]*1000)+(arr[1]*100)+(arr[2]*10)+(arr[3]);
				int num2=(arr[3]*1000)+(arr[2]*100)+(arr[1]*10)+(arr[0]);
				temp=num2-num1;
			}
			return count;
		}
	}

	private static int[] intoarr(int temp) {
		int arr[]=new int[4];
		int i=3;
		while(temp>0)
		{
			arr[i]=temp%10;
			temp=temp/10;
			i--;
		}
		return arr;
	}

}
