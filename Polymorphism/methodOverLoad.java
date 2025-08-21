class MethodOverLoad{
	void add(int x, int y){
		System.out.println(x+y);
	}
	//void add(int x, int y, int z){
	//	System.out.println(x+y+z);
	//}
	int add(int x, int y, int z){
		return x+y+z;
	}
	void add(String s1,String s2){
		System.out.println(s1+" "+s2);
	}
	public static void main(String... ar){
		MethodOverLoad mt = new MethodOverLoad();
		mt.add(10,20);
		//mt.add(100, 200, 300);
		mt.add("Lavish", "Todiwal");
		System.out.println(mt.add(100, 200, 300));
	}
}