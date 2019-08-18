
public class ExplicitThrow {

	void checkBalance(int balance) {
		if(balance>10000) {
			System.out.println("Sufficient Balance");
		}else {
			throw new ArithmeticException("In-Sufficient Balance");
		}
	}
	
	public static void main(String[] args) {
		try {
		new ExplicitThrow().checkBalance(50000);
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException:"+e.getMessage());
		}
		
	}
}
