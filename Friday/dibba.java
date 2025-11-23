class dibba{
	public static void main(String... s){
		int i,j,x,n,sp;
		System.out.print("Enter size: ");
		n= new java.util.Scanner(System.in).nextInt();
		sp=n/2;
		x=n;
		if(n>1 && n%2!=0){
			for(i=0;i<n/2+1;i++){
				for(j=0;j<sp+i;j++){
					System.out.print(" ");
				}
				for(j=0;j<x;j++){
					System.out.print("@");
				}
				System.out.println();
				x-=2;
			}
			sp=n-2;
			for(i=0;i<n;i++){
				System.out.print("*");
				for(j=0;j<sp;j++){
					if(i==0)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
			}
		}
		else{
			System.out.print("\n invalid output");
		}
	}
}