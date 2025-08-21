class pt18{
	public static void main(String... s){
		int i,j,start=64;
		int n= new java.util.Scanner(System.in).nextInt();
		for(i=0;i<n;i++){
			char ch = (char)(start+n);
			//space
			//alphabets
			for(j=0;j<=i;j++){
				System.out.print(ch+" ");
				ch--;
			}
			System.out.println();
		}
	}
}