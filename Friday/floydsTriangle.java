class FloydsTriangle{
	public static void main(String... t){
		int n,sum=1,i,j;
		System.out.print("Enter size: ");
		n= new java.util.Scanner(System.in).nextInt();
		for(i=0;i<n;i++){
			for(j=0;j<=i;j++){
				System.out.print(sum+" ");
				sum++;
			}
			System.out.print("\n");
		}
	}
}