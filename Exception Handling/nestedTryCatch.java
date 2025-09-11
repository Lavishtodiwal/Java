class nestedTryCatch {
	public static void main(String... s){
		try {
			try{
				int x= 2/s.length;
			}
			catch(ArithmeticException e){
				System.out.println("AE-> "+e);// this will catch the arithmetic exception like 10/0
			}
			try{
				int z[] = new int[s.length];
				z[10]= 1123;
			}
			catch(ArrayIndexOutOfBoundsException ae){
				System.out.println("AIOBE-> "+ae);//this will catch if any out of bound exception found
			}
		}
		catch(Exception E){
			System.out.println("Exception-> "+E); //this will catch if any other exception found 
		}
		
	}
}