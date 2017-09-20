package Session6_Assignment4_E;

public class ExceptionATM {

public static void main(String[] args) {
		
	BankAtm atm1 = new BankAtm("br56789","Lloyds","Chelsea",35000.00); //object1
	BankAtm atm2 = new BankAtm("bf98403","Barclays","Lewisham",35000.00); //object2
	BankAtm atm3 = new BankAtm("bg86470","HSBC","Orpington",46000.00);//object3
	
	
		try {
			atm1.withdraw(40000.00);   // Amount to be withdrawn is greater than the balance using object1
			
		} catch (ExceptionBank e) {
		
			e.printStackTrace(); //prints this throwable and its backtrace to the standard error stream
		}
		
	
		try {
			atm2.withdraw(30000.00); // withdrawing amount making Balance less 10000 limit using object 2
		} catch (ExceptionBank e) {
		
			e.printStackTrace();//prints this throwable and its backtrace to the standard error stream
		}
		
		atm3.deposit(20000.00); //Depositing amount using object3
		

		try {
			atm3.withdraw(20000.00);  //Withdrawing amount lesser than balance using object3
		} catch (ExceptionBank e) {
		
			e.printStackTrace();
		}
		
	}
}
