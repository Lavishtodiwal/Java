class Init{
	int x;
	{
		System.out.println("init block");
		this.x=10;
	}
	Init(){
		System.out.println("default block");
		System.out.println(x);
	}
	Init(int x){
		System.out.println("parameterized block");
		System.out.println(x);
	}
	public static void main(String... s){
		new Init();
		new Init(10);
		new Init(100);
		
	}
}

//init block is always executed before any constructor 
//complete code inside the init block will be inserted at the first line of the constructor if chaining is not done.
//and it runs every time when object of that class is created