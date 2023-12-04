interface TestI{
	void m1();
	public void m2();
	abstract void m3();
}
	class TestImp implements TestI{
		public void m1(){
			System.out.println("Hello...");
			
		}
		public void m2(){
			System.out.println("good morning");
		}
		public void m3(){
			System.out.println("Byee byee");
		}
		
		public static void main(String[]args){
		TestI T = new TestImp();
		T.m1();
		T.m2();
		T.m3();
		}
	}
	
	
	