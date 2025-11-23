class armstrong{
	public static void main(String... s){
		int arm=0, a,d;
		System.out.print("Enter number to check armstrong: ");
		int n= new java.util.Scanner(System.in).nextInt();
		d=n;
		while(n>0){
			a= n%10;
			n=n/10;
			arm= arm+a*a*a;			
		}
		if(arm==d){
			System.out.print("Armstrong Number!");
		}
		else
			System.out.print("Not a Armstrong Number!");
	}
}