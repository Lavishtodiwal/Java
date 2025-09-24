class MultipleInheritence {
	public void showA(){
			System.out.println("show inside the parent");
	}
}

class MultipleInheritence1{
	public void showB(){
			System.out.println("show inside the parent1");
		}
}
class child extends MultipleInheritence1,MultipleInheritence {
	public static void main(String... s){
		child c1 = new child();
		c1.showA();	
		c1.showB();	
	}
}
