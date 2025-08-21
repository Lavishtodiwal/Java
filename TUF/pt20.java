class pt20{
	public static void main(String... s){
		int i,j,space,initial;
		int n= new java.util.Scanner(System.in).nextInt();
		initial=n;
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				System.out.print(initial);
				initial--;
			}
			initial =n+i+1;
			System.out.println();
		}
	}
}