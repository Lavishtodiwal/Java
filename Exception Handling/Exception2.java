class Exception2{
	public static void main(String... s){
		//---------------------------------------------------------------------------------------------------------
		
		//javac Exception1.java
		//java Exception xyz abc 
		// above xyz and abc are the command line arguements they will store in main methods array s and the s.length will become the 2 
		try{
			int x = 20/s.length;
			System.out.println(x);
			int []z= new int[s.length];
			z[10]= 1000; // here it will also give an error 'index 10 out of bound'	
		}
		catch(ArithmeticException e){
			System.out.println(e);	
		}
		catch(ArrayIndexOutOfBoundsException a){
			System.out.println(a);
		}
		System.out.println("\t=========The end statement=========");
	}
}

// the above program hava 2 exceptions one is 20/0 (bydefault value of s )
//if we enter java exception1 abc and xyz so the s.length will become 2 and x = 10 and first exception will pass and then it will give also an exception  that 'index 10 is out of bound'
