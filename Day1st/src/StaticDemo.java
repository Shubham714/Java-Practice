
public class StaticDemo {

	static int value;
	
	void displayValue() {
	  System.out.println("Value:"+value);	
	}
	
	public static void main(String[] args) {
		
		StaticDemo sd=new StaticDemo();
		StaticDemo sd1=new StaticDemo();
		StaticDemo sd2=new StaticDemo();
	  sd.value=21;
	  sd1.value=23;
	  sd2.value=25;
				sd.displayValue();
				sd1.displayValue();
				sd2.displayValue();

	}

}
