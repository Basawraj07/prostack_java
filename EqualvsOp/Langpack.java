class Parent{}
class Child extends Parent{}
class Emp{}
class Test{
	public static void main(String[]args){
		
		String s1 =  new String("BASU");
		String s2 = new String("BASU");
		
		StringBuffer s = new StringBuffer("BASU");
		StringBuffer s0 = new StringBuffer("BASU");
		
		String n1 = "BASU";
		String n2 = "BASU";
		
		Emp e1 = new Emp();
		Child c1 = new Child();
		
		int num = 1;
		int num2 = 2;
		
		System.out.println(s==s0);
		System.out.println(s1==s2);
		System.out.println(s.equals(s0));
		
		
	}	
}

