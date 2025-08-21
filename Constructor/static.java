class Static{
	static int x;
	static {
		System.out.println("Static block");
		x=10;
	}
	public static void main(String... s){
		System.out.println("main block");
	}
}
//static block only executed once in the life cycle of class 

//means when compile this .java file we get three classes
class Static1{
	public static void main(String... s){
		System.out.print(Static.x);
		Static.x=40;
	}
}
class Static2{
	public static void main(String... s){
		System.out.print(Static.x);
	}
}
