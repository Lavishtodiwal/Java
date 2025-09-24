class Equals {
	public static void main(String... q){
		Equals e1 = new Equals();
		Equals e2 = new Equals();
		
		System.out.println(e1==e2); // it will give false bcz e1 and e2 me object ke reference id hogi joki new operator ki vajh se har baar nyi bnegi so ye to equal hogi hi nhi
		
		//isi ka ek function bhi hai
		
		boolean b = e1.equals(e2);// method to check the equal
		System.out.println(b);
		System.out.println();
		
		
		System.out.println("=======================================");
		
		String s1 = "Hello";
		String s2 = new String("Hello");
		//but in case of the string it will not work like that ki reference id check krega nai ye check krega string ke case me value inside the strings. 
		// jaise dono me hi Hello hai so ye dono content or string same hai to ye true return krega
		System.out.println(s1.equals(s2));
		System.out.println();
		System.out.println();
		
		//but in case of the case sensitive it will not work it will give the false 
		String s3 = new String("hello");
		System.out.println("Equals of string method-> "+s1.equals(s3));
		
		// and isko ignore karne ke liye humare pass ek or method hai 
		
		System.out.println("IgnoreCase method-> "+s1.equalsIgnoreCase(s3));
	}
}