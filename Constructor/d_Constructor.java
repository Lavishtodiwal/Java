class D_Constructor{
	int x = getX();
	int getX(){
		System.out.println(x+"from getX()");
		return 10;
	}
	D_Constructor(){
		x = 20;
		x = getX();
		System.out.println(x+"from d_constructor");
	}
	public static void main(String... s){
		D_Constructor c1 = new D_Constructor();
	}
}

/* Before constructor the instance variable will initialize and x will call the getX function but it will print the by default value that is 0 and returns the 10 and now x = 10 
after the instance variable the constructor will execute, here x =20 and again it will call getX and it will print the 20 and now getX () will return 10 and again x is assigned to 10 and after all this will print the 10 */