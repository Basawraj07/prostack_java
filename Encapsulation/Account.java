public class Account{
	private int Ebal;
	private String Ename;
	private double Eid;
	      //+
	public int get_Ebal(){
		return this.Ebal;
	}
	public String get_Ename(){
		return	this.Ename;
	}
	public double get_Eid(){
		return this.Eid;
	}
	
	public void set_Ebal(int bal){
		this.Ebal = bal;
	}
	public void set_Ename(String name){
		this.Ename = name;
	}
	public void set_Eid(double id){
		this.Eid = id;
	}
}
	