class AllMethods{
	static int wordCount(String s){
		String []str = s.split(" ");
		int count =0;
		for(String word: words)
			count++;
		
		System.out.println(count);
	}
	public static void main(String... z){
		String s = "India is my country";
		wordCount(s);
		
	}
}
