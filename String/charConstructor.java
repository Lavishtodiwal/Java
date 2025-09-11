class charConstructor {
	public static void main(String... q){
		char[]ch = {'a','b','c','d','e','f','g'};
		String s = new String(ch); //it converts the character array to string
		String s1 = new String(ch,2,); //it is like trim it stores in s1 from 2nd index to 3 characters
		System.out.println(s);
		System.out.println(s1);
	}
}