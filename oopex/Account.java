package oopex;
public class Account extends Bank{
	private int acc_id;
	private String acc_name;
	private double acc_bal;
	              //+
	   public void  setacc_id(int id){
		   this.acc_id = id;
	   }
	   public void  setacc_name(String name){
		   this.acc_name = name;
	   }
	   public void  setacc_bal(double acc_bal){
		   this.acc_bal = acc_bal;
	   }
	   
	   public int getacc_id(){
		   return this.acc_id;
	   }
	   public String getacc_name(){
		   return this.acc_name;
	   }
	   public double getacc_bal(){
		   return this.acc_bal;
	   }
	   
	   
	public void cal_bal(){}
}