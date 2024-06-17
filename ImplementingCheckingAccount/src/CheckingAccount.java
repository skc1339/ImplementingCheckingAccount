
public class CheckingAccount extends BankAccount{
	private static Object accountID;
	private double interestRate;
	
	// Constructor
	public CheckingAccount(String firstName, String lastName, int account, double interestRate) {
		super(firstName,lastName, accountID);  // Explicitly call superclass constructor
		this.interestRate = interestRate;
	}
	
	// Method to process a withdrawal with an overdraft fee
	public static void precessWithdrawal(double amount) {
		double balance = 0;
		if (amount > 0 && amount <= balance) {
			precessWithdrawal(amount); 
			
		} else if (amount > 0) {
			System.out.println("Overdraft! Withdrawal: $" + " | Overdraft Fee: $30 | New Balance: $" + balance);
		} else {
			System.out.println("Withdrawal amount must be positive.");
		}
	}
	
	// Method to display all attributes including interest rate
	public void displayAccount() {
		accountSummary();
		System.out.println("Interest Rate: " + interestRate + "%");	
	}
	
	// Getter for interest rate
	public double getIterestRate() {
		return interestRate;
	}
	
	// Setter for interest rare
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public static void deposit(double d) {
		int amount = 0;
		if (amount > 0) {
			int balance = amount;
			System.out.println("Deposited: $" + amount + " | New Balance: $" + balance);
			
		}
	}

}

