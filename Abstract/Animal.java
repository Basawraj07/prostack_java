abstract class Animal{
	public abstract void Animal_sound();
	public void Sleep(){
		System.out.println("The pig is sleeping");
	}
}

class Pig extends Animal{
	public void Animal_sound(){
		System.out.println("zee zeeee zeeeee!!!");
	}
}

class main{
	public static void main(String[]args){
	Pig P = new Pig();
	P.Sleep();
	P.Animal_sound();
	
	}
}