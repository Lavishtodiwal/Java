class Concatnation{
	public static void main(String... e){
		String s = "Good ";
		s = s + "morning";
		System.out.println(s);
		s = s +100; //if before and after + sign is string then next and before value will be concate in the string
		System.out.println(s);
		s = 10+20+s+", bhai"+30+40;// here firstly 10 and 20 will add and after that 30 + s hoyega then isme ab 30 or s wali string concatinate ho jayegi
		System.out.println(s);
	}
}

// above s= s+10;
// is working  like  in background that firstly 10 is converted in -> newInteger(10).toString(); <- Wrapper class
//which is used to convert the num to string