class MultiLevelInheritence{
	int x = 10;
	protected int y = 20;
	private int z = 30;
	void showA(){
		System.out.println("show from the parent class");
	}
}

class Parent extends MultiLevelInheritence{
	int x = 100;
	protected int y= 200;
	void showB(){
		showA();
		System.out.println("show from the -sub- parent class");
	}
}

class child extends Parent{
	public static void main(String... s){
		child c1 = new child();
		c1.showB();
		
	}
}