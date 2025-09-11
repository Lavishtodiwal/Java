class InstanceOf {
	public static void main(String... s){
		try{
			int x= 10/s.length;
			int []z= new int[s.length];
			z[5]= 1000;
		}
		// catch(ArithmeticException ae){
			// System.out.println(ae);
		// }
		// catch(ArrayIndexOutOfBoundsException be){
			// System.out.println(be);
		// }
		//instead of this we can use this 
		//---------------------------------------------------------
		
		// catch(Exception e){
			// if(e instanceof ArithmeticException){
				// System.out.println("Arithmetic Exception is occured");
			// }
			// else if(e instanceof ArrayIndexOutOfBoundsException){
				// System.out.println("AIOBE exception is occured");
			// }
		// }
		
		// but we generally don't use this much 
		//instead of this 
		//---------------------------------------------------------
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
			System.out.println("Error-> "+e);
		}
		
		
	}
}