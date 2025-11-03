class Parameterized {
	public static void main(String... s){
		String s1 = new String("Hello");
		System.out.println(s1); // it returns the given string beacuse of toString method override this rather then before when we create the class object and when i print that object it returns the hexacode(classname@some random value
		
		String s3 = new String("Hello");
		System.out.println(s1);
		System.out.println(s3);
		System.out.println(s1==s3);
		//above code will give false bcz they created using new operator which gives the memory on the heap and they both have the different-2 address so they can't be same in case of their refference id
		
		String s2= s1.intern();
		String s4 = s3.intern();
		//intern() method checks that this string is inside the string constant pool or not if exist then returns the refference otherwise it create new string in scp
		//and scp does not contain any duplicate value 
		System.out.println(s4==s2);
	}
}