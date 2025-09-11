class StackCheck{
	void show(){
		int x= 10/0;
	}
	void display(){
		show();
	}
	void xyz(){
		display();
	}
	public static void main(String... s){
		StackCheck sc = new StackCheck();
		try{
			sc.xyz();
		}
		catch(ArithmeticException ae){
			ae.printStackTrace();
		}
	}
}