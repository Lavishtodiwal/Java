class pt10{
	public static void main(String... s){
		int i,j;
		int n= new java.util.Scanner(System.in).nextInt();
		for(i=0;i<n/2+1;i++){
			for(j=0;j<i+1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=0;i<n/2;i++){
			for(j=0;j<n/2-i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}