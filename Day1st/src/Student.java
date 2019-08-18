
public class Student {
	
	void diplayEnhancedLoop() {
	    int arr[]= {1,2,3,4,5,6,7,8,9};
		for(int temp: arr) {
			if(temp%2==0)
				break;
			System.out.println(temp);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student s1=new Student();
     s1.diplayEnhancedLoop();
	}
}
