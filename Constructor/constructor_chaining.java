class Constructor_chaining{
	Constructor_chaining(){
		//this should be in the first line inside the constructor
		this(10);
		System.out.println("default");
	}
	Constructor_chaining(int x){
		this(10,20);
		System.out.println("parameterized"+" "+x);
	}
	Constructor_chaining(int x,int y){
		System.out.println(x+y);
	}
	
	public static void main(String... s){
		new Constructor_chaining();
	}
}