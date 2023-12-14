class Test{}
class Demo{}
class TestDemo{
	public static void main(String[]args){
		Test t1 = new Test();
		Test t2 = new Test();
		Demo d1 = new Demo();
		String s1 = new String("Basu");
		int a = 100;
		int b = 200;
		int c = 100;
		
		System.out.println(t1.equals(t2));
		System.out.println(t1 == t2);
		System.out.println(a == c);
		System.out.println(a==b);
		System.out.println(s1);
		
	}
}