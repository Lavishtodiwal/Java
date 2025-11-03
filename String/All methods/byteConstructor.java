class byteConstructor{
	public static void main(String...q){
		byte[] b= {65,66,67,68,69,70};
		String s = new String(b);//it converts the byte code to string 
		System.out.println(s);
		// string(byte b[], int position, int steps or no.of elements
		String s1 = new String(b, 1,3); //it acts like trim
		System.out.println(s1);
	}
}
