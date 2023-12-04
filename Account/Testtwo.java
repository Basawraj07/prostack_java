interface Testone{
	void m1();
}
class Testtwo implements Testone{
	public void m1(){
		System.out.println("Hello Good Morning.....");
	}
	
	public static void main(String[]args){
		new Testtwo().m1();
	}
}