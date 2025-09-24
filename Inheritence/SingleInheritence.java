class SingleInheritence {
	int x = 100;
	private int y = 200;
	protected int z = 300;
	void show(){
		System.out.println("Show function from the parent class");
	}
}
class child extends SingleInheritence{
	public static void main(String... s){
		child c1 = new child();
		c1.show();
		System.out.println(c1.x);
		//System.out.println(c1.y); // we cant inherit the private things from the parent class
		System.out.println(c1.z);// we can access the private things from the parent class
	}
}