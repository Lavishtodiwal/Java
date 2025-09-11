class Finally{
	public static void main(String... s){
		try{
			int x = 10/0;
		}
		catch(Exception e){
			System.out.println("Error-> "+ e);
		}
		finally{
			System.out.println("This is the finally block that will execute");
		}
	}
}