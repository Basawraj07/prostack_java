class Inheritance {
	protected int num =101;
public void m1(){
	System.out.println("hellloooo!");
}
}
class Child extends Inheritance{
	public static void main(String[]args){
	System.out.println("Good morning");
	Inheritance I = new Inheritance();
	I.m1();
	}
}
class Test extends Child{
	public static void main(String[]args){
	System.out.println("Byeee");
	Child C = new Child();
	C.m1();
	System.out.println(C.num);
	}
}