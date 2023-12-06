class Account{
	int acc_bal;
	static int min_bal=500;
	public void open_acc(){}
	
	public boolean dep_amount(int amount){
		this.acc_bal = this.acc_bal+amount;
		return true;
	}
	
   public int get_bal(){
	return this.acc_bal;
}
	public void withdraw(int amount){
		this.acc_bal = acc_bal - amount;
	}
	
}