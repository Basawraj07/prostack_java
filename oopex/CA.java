package oopex;
public class CA extends Account{
	private double min_bal;
	    //+
	public double getmin_bal(){
		return this.min_bal;
	}
	public void setmin_bal(double min_bal){
		this.min_bal = min_bal;
	}
		
	public void cal_bal(){
		double amount1 = this.getacc_bal() - this.getmin_bal();
		System.out.println(amount1);
	}
}