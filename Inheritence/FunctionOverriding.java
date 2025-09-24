class FunctionOverriding {
	void show(){
		System.out.println("Show from the parent side");
	}
}

class child extends FunctionOverriding{
	void show(){
		System.out.println("Show from the child side");
		//return 30;
	}
	public static void main(String... q){
		child c = new child();// is allowed
		FunctionOverriding c = new child(); // is allowed like strongger to weaker like papa can do child's work but child can't do father's work
		child c = new FunctionOverriding();
		c.show();
	}
}