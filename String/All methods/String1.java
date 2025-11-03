class String1{
	public static void main(String... s){
		// 1. 'new' keyword hamesha heap par naya object banata hai
        String s1 = new String("Hello");

        // 2. Literal pool mein object banata hai ya purana reuse karta hai
        String s2 = "Hello";

        // 3. 's3' pool mein "Hello" ko dhoondega aur s2 wala object hi use karega
        String s3 = "Hello";

        // Comparison Results
        System.out.println("--- Comparing Memory Addresses (==) ---");
        System.out.println("s1 == s2 ?  " + (s1 == s2)); // False -> s1 heap mein hai, s2 pool mein

        System.out.println("s2 == s3 ?  " + (s2 == s3)); // True -> Dono pool ke ek hi object ko point kar rahe hain

        System.out.println("\n--- Comparing Content (.equals()) ---");
        System.out.println("s1.equals(s2) ? " + s1.equals(s2)); // True -> Dono ka content "Hello" hai
	}
}