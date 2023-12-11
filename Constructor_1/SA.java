class SA extends Account{
	public int e_id;
	public double e_amount;
	
	SA(int id,String name , String email , String loc , double amount){
		super(name,email,loc);
		this.e_id=id;
		this.e_amount=amount;
		
	}
	
}