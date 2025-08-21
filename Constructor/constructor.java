class Constructor{
	int x = 10;
	int y = 20;
	Constructor(){
		x = 30;
		y = 40;
	}
	void show(){
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String... s){
		Constructor c1 = new Constructor();
		c1.show();
	}
}