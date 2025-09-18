package OopsConcepts;

public class Bank {
public static void main(String[] args) {
	Bank employee1 = new Bank();
	employee1.deposit(100,1111);// method calling stmt
	int amount = employee1.withdraw(100,1111);
	System.out.println("Withdraw amount: "+ amount);
	employee1.enquiry();
}

private void enquiry() {
	System.out.println("It is just a method without argument");
	
}

private int withdraw(int i, int j) {
	return 100;
	
}

private void deposit(int amount, int accNo) // method signature
{ // method definition
	System.out.println("Deposite "+ amount + " in account number "+ accNo);
	
}
}
