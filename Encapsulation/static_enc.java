class Static_enc{
	int x;
	int y;
	void get(int l1,int l2){
		x= l1;
		y = l2;
	}
	void show(){
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String... s) {
		Static_enc e1 = new Static_enc();
		e1.get(10,20);
		e1.show();
	}
}