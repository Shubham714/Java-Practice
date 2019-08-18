
public class Main {

	public static void main(String[] args) {
		
		Student s=new Student();
		s.setRollNo(500);
		int rollNumber=s.getRollNo();
		System.out.println("Roll No:"+rollNumber);
		s.setName("Pradip");
		System.out.println("My Name is:"+s.getName());
	}

}
