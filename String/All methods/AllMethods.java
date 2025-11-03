class AllMethods{
	public static void main(String... s){
		String s1= "hello";
		String s2 = "Hello";
		String s3 = new String("hello");
		String s4 = "     hii,     ";
		
		System.out.println(s1==s2); //it compares the refferences of both
		System.out.println(s1==s3); //it compares the refferences of both
		System.out.println(s1.equals(s3)); //this method will check all the data inside the strings are equal or not
		
		System.out.println(s1.equalsIgnoreCase(s2));//this will ignore any case u have write it will always checks the characters 
		
		System.out.println(s1.contentEquals(s3));//checks the content 
		
		System.out.println(s1.length()); // to check the length
		
		System.out.println(s1.charAt(3)); //find char at index
		
		System.out.println(s1.compareTo(s2));//gives 32 because difference btwn h and H lexicographically is 32 that it ascii value difference so we can say it compares it lexicographically
		
		System.out.println(s1.compareToIgnoreCase(s2)); //it ignores the case sensitivity
		System.out.println(s1.contains("l"));//checks if the subString is present or not 
		
		System.out.println(s1.startsWith(s3));//checks it start with that substring
		
		System.out.println(s1.endsWith("o"));//checks it ends with of
		
		System.out.println(s1.indexOf("l"));//checks the index of the given character
		System.out.println(s1.indexOf("llo"));//checks the index of the given character
		
		System.out.println(s1.lastIndexOf("e"));//
		
		System.out.println(s1.substring(2));//it trims the string from starting of 2 ans will like "llo"
		
		System.out.println(s1.substring(2,4));//it trims the string from starting of 2 and ending till 4(excluded) ans will like "ll"
		
		System.out.println(s4);//
		System.out.println(s4.trim());//removes the white spaces
		
		
		System.out.println(s1.replace('e','E'));//replace the chars
		
		System.out.println("Hello12345".replaceAll("[a-z]",""));//replaces the regex pattern like a-z 0-9 A-ZipConstants
		
		System.out.println(String.join("-","a","b","c"));//
		
		byte[]str = s1.getBytes();
		for(int i: str)
			System.out.println((char)i);
		
		String text = "Hello world from Java";
		String[] words = text.split(" ");

		for (String word : words) {
			System.out.println(word);
		}
		
	}
}