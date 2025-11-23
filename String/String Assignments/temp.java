class temp{
	public static void main(String... z){
		String s = "car is a invention to travel";
		String d ="to";
		String words[] = s.split(" ");
		for(String word:words){
			if(word.equals(d)){
				System.out.println("true");
			}
			else
				System.out.println("false");
				
		}		
	}
}