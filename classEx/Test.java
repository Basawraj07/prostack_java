class Test{
	public static void main(String[]args){
		Account a1 = new Account();
	
		a1.dep_amount(5000);
		int bal = a1.get_bal();
		System.out.println(bal);
		
		Account a2 = new Account();
		a2.open_acc();
		a2.dep_amount(40000);
		System.out.println(a2.get_bal());
		
		           a1.withdraw(15);
                a2.withdraw(100000);
                System.out.println(a1.get_bal());
                System.out.println(a2.get_bal());
				System.out.println(a1.min_bal);
				

	}
}