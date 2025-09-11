class FinallyNotExecute{
	static int show(){
		try{
			System.exit(0);
		}
		catch(ArrayIndexOutOfBoundsException ae){
			System.out.println(ae);
		}
		finally{
			return 44;
		}
	}
	// hurrah here is finally is not executed so that there is only one condition that will not execute the finally block ->>  System.exit(0)
	public static void main(String... s){
		System.out.println(show());
	}
}