class IQ2{
	static int show(){
		try{
			int x = 10/0;
			return 120;
		}
		catch(ArrayIndexOutOfBoundsException ae){
			System.out.println(ae);
		}
		finally{
			return 140;
		}
	}
	// again here the priority goes to the finally block and it returns the 140
	//but there is only one condition that will not execute the finally block.
	public static void main(String... s){
		System.out.println(show());
	}
}