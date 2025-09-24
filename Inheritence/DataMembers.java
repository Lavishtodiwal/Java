class DataMembers{
	int x =100;
}
class child extends DataMembers{
	int x = 20;
	void show(){
		System.out.println(x);
		System.out.println(super.x);
		System.out.println(((DataMembers)this).x); //super --> ((DataMembers)this) <-- is used to call the parent things and use that things 
		//System.out.println(super);
	}
	public static void main(String... s){
		child c1 = new child();
		c1.show();
	}	
}