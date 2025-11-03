class Return{
	int x;
	Return(int x){
		this.x= x;
	}
	void  show1(){
		System.out.println("void");
	}
	int show2(){
		return x;
	}
	String show3(){
		return "Hlo";
	}
	public static void main(String... s){
		System.out.println(new Return(10).show2());
//		System.out.println(r.show3());
	}
}