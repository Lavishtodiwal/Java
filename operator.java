class Operator {
	public static void main(String... s) {
		int a = 10, b= 20, c = 30;
		// pre -> pehle operation then use
		//post -> pehle use then baad me operation
		System.out.println(++a); //pre increament
		System.out.println(b++); //post increament
		System.out.println(b); // after the post increament
		System.out.println(--c); // pre decrement
		System.out.println(c--); // post decrement
		System.out.println(c); //after the post decrement
	}
}