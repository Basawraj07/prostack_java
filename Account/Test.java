package Pack1;
class Test{
	public static void main(String[]args){
		Account a1 = new Account();
		Account a2 = new Account();
		a1.open_Account();
	a1.deposite_Amount(500);
	a2.delete_Account();
	a2.get_balance();
	a1.get_statement();
	}
	
}