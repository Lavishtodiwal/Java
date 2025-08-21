class This{
	int x = 10 ;
	void show(This y, int x){
		System.out.println(x);
		System.out.println(y+" "+"from This class");
		System.out.println(this.x); 
		//this is called the data shadowing because it hides the local variable 's value 20
	}
	void disp(){
		System.out.println(this +" "+"from disp() ");
		/*In this we don't need to pass this as arguement bcz it passes the this by default */
	}
	public static void main(String... s){
		This t1 = new This();
		System.out.println(t1+" "+"from main class");
		System.out.println(t1.x);
		t1.show(t1,20);
		t1.disp();
	}
}