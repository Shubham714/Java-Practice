import java.util.Scanner;

public class TwoDimesionalArray {
	
	static int arr[][]=new int[3][3];
	
	static Scanner sc=new Scanner(System.in);
	
	static void getArray() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println("enter array["+i+","+j+"]");
				arr[i][j]=sc.nextInt();
			}
		}
	}
	static void dispArray() {
		
		for(int i=0;i<3;i++) {
			System.out.print("\n");
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]);
			}
		}
	}
	public static void main(String[] args) {
		TwoDimesionalArray.getArray();
		TwoDimesionalArray.dispArray();
	}
}
