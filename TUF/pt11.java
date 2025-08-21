class pt11{
	public static void main(String... s){
		int i,j,start;
		int n= new java.util.Scanner(System.in).nextInt();
		for(i=0;i<n;i++){
			if(i%2==0) start=1;
			else start=0;
			for(j=0;j<=i;j++){
				System.out.print(start+" ");
				start=1-start;
			}
			System.out.println();
		}
	
	}
}