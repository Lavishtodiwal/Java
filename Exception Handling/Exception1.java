class Exception1{
	// public static void main(String... s){
		// int x = 10/0;
		// System.out.println(x);
		// System.out.println("After the exception");
	// }
	//--------------------------------------------------
	//After try block or use of the handler
	
	public static void main(String... s){
		try{
			int x= 10/0;
			System.out.println(x);
	}catch(ArithmeticException e){
		System.out.println(e);
		System.out.println("u can't divide any no. by zero. ");
	}
	System.out.println("After the Exception or using the handler(Try Block).");
	}
}