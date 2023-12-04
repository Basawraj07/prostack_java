package Pack1;
class Account{
	public void open_Account(){
		System.out.println("Account opened sucessfully");
	}
	 boolean deposite_Amount(int amount){
		System.out.println("amount deposited sucessfully");
		return true;
	}
	
	int get_balance(){
		System.out.println("getting Bal - Successfully");
		return 0;
	}
	public void get_statement(){
		System.out.println("this is 2023 statement");
		
	}
	public void delete_Account(){
		System.out.println("Account is deleted");
	}
}