class String2{
	public static void main(String... s){
		String s1 = new String("Hello");
		String s2= s1.intern();
		
		String s3 = new String("Hello");
		String s4= s3.intern();
		System.out.println(s2==s4);
	}
}