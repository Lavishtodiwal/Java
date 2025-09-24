class Updatation{
	int x;
	int y;
	void show(){
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String... s){
		child c1 = new child();
		c1.set(10,20);
		c1.show();
	}
}

class child extends Updatation{
	void set(int x, int y){
		this.x = 10;	
		this.y = 20;
	}
}