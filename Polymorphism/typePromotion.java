class TypePromotion{
	void show(byte b){
		System.out.println(b+"from show(byte)");
	}
	void show(int x) {
		System.out.println(x+"from show(int)");
	}
	void show(long l){
		System.out.println(l+"from show(long)");
	}
	void show(int x, long l){
		System.out.println(x+l+" " + "from show(int, long)");
	}
	void show(long l, int x){
		System.out.println(l+x +" " + "from show(long,int)");
	}
	public static void main(String... ar){
		TypePromotion t1 = new TypePromotion();
		//t1.show(10);
		//t1.show(1000L);
		//t1.show(1000000);
		//t1.show(100,1000);
		
		/*it gives a ambigous error bcz they both are same and want to int,int bcz of the default value taken by compiler for num values is int so it is serching in all the show methods after all it finds that one is taking int and long and second one is taking long and int and compiler is confused here and give the ambiguity error.
		*/
		// here we can resolve this
		
		t1.show(100L, 1000);
		t1.show(1000, 100L);
	}
}