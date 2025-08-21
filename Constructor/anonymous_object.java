class Anonymous_object{
	int x=10;
	int show(){
		return 100;
	}
	void show1(){
		System.out.println("from show1()");
	}
	public static void main(String... s){
		System.out.println(new Anonymous_object().x);
		System.out.println(new Anonymous_object());
		new Anonymous_object().show1();
	}
}