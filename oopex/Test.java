package oopex;

public class Test{
	public static void main(String[]args){
		
		SA sa = new SA();
		sa.setacc_id(101);
		sa.setacc_name("Rahul");
		sa.setacc_bal(5000);
		sa.setmin_bal(500);
		
		
		
		CA ca = new CA();
		sa.setacc_id(101);
		sa.setacc_name("Rahul");
		ca.setacc_bal(100);
		ca.setmin_bal(50);
		
		AccountService.getServices(sa);
		AccountService.getServices(ca);

	}
}