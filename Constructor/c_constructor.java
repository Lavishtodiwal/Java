class C_constructor{
	int x;
	int y;
	C_constructor(){
		x=10;
		y=20;
	}
	C_constructor(int x, int y){
		this.x=x;
		this.y=y;
	}
	C_constructor(C_constructor z){
		this.x= z.x;
		this.y= z.y;
	}
	void show(){
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String... s){
		C_constructor c1= new C_constructor();
		c1.show();
		C_constructor c2= new C_constructor(100,200);
		c2.show();
		C_constructor c3= new C_constructor(c2);
		c3.show();
		
	}
}