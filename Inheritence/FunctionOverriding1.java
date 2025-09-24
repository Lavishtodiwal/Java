class FunctionOverriding1 {
	FunctionOverriding1 show(){
		System.out.println("Show from the parent side");
		return new FunctionOverriding1();
	}
}

class child extends FunctionOverriding1{
	child show(){
		System.out.println("Show from the child side");
		return new child();
	}
	public static void main(String... q){
		child c = new child();
		c.show();
	}
}