class CountDigits{
	public static void main(String... s){
		int n=0,a=0;
		System.out.print("Enter a number ");
		n= new java.util.Scanner(System.in).nextInt();
		if(n<0){
			n= n*-1;
		}
		else if(n==0){
			n=1;
		}
		while(n>0){
		n=n/10;
		a++;			
		}
		System.out.print("No. of digits is : "+a);
	}
}