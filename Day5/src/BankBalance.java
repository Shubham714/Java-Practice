
public class BankBalance {
  void checkBalance(int balance) throws BalanceCheckException {
	  if(balance>10000) {
		  System.out.println("Sufficient balance");
	  }
	  else {
		throw new BalanceCheckException("In-Sufficient Balance in Bank");  
	  }
  }
  
  public static void main(String[] args) {
	try {
		new BankBalance().checkBalance(50000);
	} catch (BalanceCheckException e) {
		System.out.println("BalanceCheckException:"+e.getMessage());
	}
}
}
