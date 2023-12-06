class Account{
	int e_id;
	String e_name;
	
	Account(int id,String name){
		this.e_id=id;
		this.e_name=name;
	}
	
	public static void main(String[]args){
		Account a1 = new Account(101,"basu");
		Account a2 = new Account(102,"Felison");
		Account a3 = new Account(103,"Sid");
		Account a4 = new Account(104,"vignesh");
		Account a5 = new Account(105,"sahil");
		Account a6 = new Account(106,"surendra");
		Account a7 = new Account(107,"abd");
		Account a8 = new Account(108,"Santosh");
		
		
		System.out.println(a1.e_id+":"+a1.e_name);
		System.out.println(a2.e_id+":"+a2.e_name);
		System.out.println(a3.e_id+":"+a3.e_name);
		System.out.println(a4.e_id+":"+a4.e_name);
		System.out.println(a5.e_id+":"+a5.e_name);
		System.out.println(a6.e_id+":"+a6.e_name);
		System.out.println(a7.e_id+":"+a7.e_name);
		System.out.println(a8.e_id+":"+a8.e_name);
	}
}