
public class Main {

	public static void main(String[] args) {
		ThisDemo td=new ThisDemo(50);
		ThisDemo td1=new ThisDemo(td);
		td.dispVal();
		td1.dispVal();
		
		System.out.println("Returning::"+td1.getThisDemo());
	}

}
