class pt16{
	public static void main(String... s){
		int i,j,start=65;
		int n= new java.util.Scanner(System.in).nextInt();
		for(i=0;i<n;i++){
			for(j=0;j<=i;j++){
				System.out.print((char)(start)+" ");
			}
			start++;
			System.out.println();
		}
	}
}