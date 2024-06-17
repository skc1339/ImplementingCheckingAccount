
public class TestCheckingAccount {
	public static void main(String[] args) {
		// Deposit money
		CheckingAccount checkingAccount = new CheckingAccount("Rachel", "Green", 01245, 1.5);
		
		
		// Deposit money
		CheckingAccount.deposit(500.0);
	
		
		// Withdrawal money within balance
		CheckingAccount.precessWithdrawal(200.0);
		
		// Attempt to withdraw money exceeding balance causing an overdraft
		CheckingAccount.precessWithdrawal(350.0);
		
		// Display account summary
		checkingAccount.accountSummary();
	}

}
