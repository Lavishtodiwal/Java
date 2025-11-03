class Compareto{
	public static void main(String... q){
		String s1 = "Hello";
		String s2 = "Hello";
		System.out.println(s1.compareTo(s2)); 
		//							working
		// ye dictionary order jaisa kaam karta hai like ye every character ko check or compare karta hai dusre wale string ke saath jaise Hello And Hello me H or H ko compare krega or agr 0 return kiya to equal hua otherwise false hoga 
		// ye dono me konse word bda hai incase of the ascii ye bhi btata hai 
		s2 = "Gello";
		System.out.println(s1.compareTo(s2));// returns the positive value 1 dega  bcz H - G hoga means (104 - 103)  
		System.out.println(s2.compareTo(s1));// returns the Negetive value 1 dega  bcz G - H hoga means (103 - 104)
	}
}