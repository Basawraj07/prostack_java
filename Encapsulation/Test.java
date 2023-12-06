class Test{
	public static void main(String[]args){
		Account a1 = new Account();
		a1.set_Ebal(500);
		a1.set_Ename("Basu");
		a1.set_Eid(10221);
		
				System.out.println(a1.get_Ebal());
				System.out.println(a1.get_Ename());
				System.out.println(a1.get_Eid());
		
	}
}