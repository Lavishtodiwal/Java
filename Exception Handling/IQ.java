class IQ{
	static int show(){
		try{
			return 10;
			//return 10/0; //jvm will come here and check this return and then see there is another return or not if it find any other then it return the next value.
		}
		catch(Exception e){
			System.out.println(e);
			e.printStackTrace();
		}
		finally{
			return 40;// after all if there is no exception found it will return 40.. 
		}
		
	}
	public static void main(String... s){
		int z = show();
		System.out.println(z);
	}
	
}