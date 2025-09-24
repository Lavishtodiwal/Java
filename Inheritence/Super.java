class Super {
	//Dadaji
	int x = 50;
}
class Base extends Super{
	int x = 30;
}
class child extends Base {
	int x = 20;
	void show(){
		System.out.println(x);// belongs to local data variables
		System.out.println(super.x);// belongs to parent data variables
		System.out.println(((Super)this).x);// belongs to super super parent (dadaji) data variables
		System.out.println(((Base)this).x); //belongs to the super data variables
	}
	public static void main(String... s){
		child c1 = new child();
		c1.show();
		//System.out.println(((Super)this).x);
	}
}