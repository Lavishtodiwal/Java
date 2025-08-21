class P_constructor{
	int x,y;
	// x=10;  we can't assign values like this inside the class we could use here contructor
	P_constructor(){
		x=10;
		y=20;
	}
	P_constructor(int x, int y){
		this.x=x;
		this.y=y;
	}
	void show(){
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String... s){
		P_constructor p1 = new P_constructor();
		p1.show();
		P_constructor p2 = new P_constructor(100,200);
		p2.show();
		P_constructor p3 = new P_constructor(1000,2000);
		p3.show();
	}
}