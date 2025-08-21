class Encapsulation{
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
		Encapsulation e1 = new Encapsulation();
		e1.get(10,20);
		e1.show();
	}
}