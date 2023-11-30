abstract class Test2{
	void m1(){}
	abstract void m2();
}
class Account{
	public static void main(String[]args){
		Test2 T=new Test2();
		System.out.println(T);
		T.m1();
	}
}