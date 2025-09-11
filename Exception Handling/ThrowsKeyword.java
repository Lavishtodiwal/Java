class ThrowsKeyword{
	int divide(int x, int y) throws ArithmeticException{
		return x/y;
	}
}
class Throws{
	public static void main(String... s){
		int a = new java.util.Scanner(System.in).nextInt();
		int b= new java.util.Scanner(System.in).nextInt();
		ThrowsKeyword tk = new ThrowsKeyword();
		tk.divide(a,b);
	}
}