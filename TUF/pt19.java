class pt19{
	public static void main(String... s){
		int i,j,start,initial;
		int n= new java.util.Scanner(System.in).nextInt();
		start=0;
		initial= n/2;
		for(i=0;i<initial;i++){
			//uperLeft
			for(j=0;j<initial-i;j++){
				System.out.print("*");
			}
			//space
			for(j=0;j<start;j++){
				System.out.print(" ");
			};
			//uperRight
			for(j=0;j<initial-i;j++){
				System.out.print("*");
			}
			System.out.println();
			start+=2;
		}
		//bottom
			start=n-2;
		for(i=0;i<n/2;i++){
			//uperLeft
			for(j=0;j<=i;j++){
				System.out.print("*");
			}
			//space
			for(j=0;j<start;j++){
				System.out.print(" ");
			};
			//uperRight
			for(j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
			start-=2;
		}
	}
}