class pt17{
	public static void main(String... s){
		int i,j,start=65;
		char ch ='A';
		int n= new java.util.Scanner(System.in).nextInt();
		for(i=0;i<n;i++){
			//space
			for(j=0;j<n-i;j++){
				System.out.print(" ");
			}
			//alphabets
			int stop =(2*i+1)/2;
			for(j=0;j<2*i+1;j++){
				System.out.print(ch);
				if(j<stop) ch++;
				else ch--;
			}
			ch ='A';
			//spaces
			System.out.println();
		}
	}
}