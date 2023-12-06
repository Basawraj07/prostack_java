class Test{
Test(){
	System.out.println("good morning");
}
public void get_details(){
	System.out.println("helllooooo!!!");
}

public static void main(String[]args){
	new Test();
	new Test();
	Test T = new Test();
	T.get_details();
	
}
}