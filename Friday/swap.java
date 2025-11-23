class Swap{
	public static void main(String... s){
		System.out.print("Enter num1: ");
		int num1 = new java.util.Scanner(System.in).nextInt();
		System.out.print("Enter num2: ");
		int num2 = new java.util.Scanner(System.in).nextInt();
		System.out.println("before swap->"+num1);
		System.out.println("before swap->"+num1);
		System.out.println(num2)
		num1 = num1+num2;
		num2 = num1-num2;
		num1= num1-num2;
		System.out.println("after swap->"+num1);
		System.out.println("after swap->"+num2);
	}
}