class Methods{
	public static void main(String... d){
		String s = "Todiwal";
		//System.out.println(s.charAt(2)); //this is used to find the character at any index
		
		for(int i =0;i<s.length();i++){
			char ch = s.charAt(i);
			System.out.println(ch);
		}
		System.out.println("-----------------------------------");
		char ch[] = s.toCharArray(); //this is used to convert the string to the char Array 
		System.out.println(ch);
		for(char x:ch){
			System.out.println(x);
		}
		System.out.println("----------------------------");
		
		byte b[] = s.getBytes(); //this is used to convert the string chars to byte
		//System.out.println(b);
		for(int x:b){
			System.out.println(x);
		}
		System.out.println("==================================");
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		System.out.println("===================================");
		s = "   Kopper   ";
		System.out.println("before trim method");
		System.out.println(s);
		String s1 = s.trim(); // it removes the white spaces from starting or from the ending side.
		System.out.println("after trim method");
		System.out.println(s1);
	}
}