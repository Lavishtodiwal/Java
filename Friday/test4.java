class test4{
	public static void main(String... s){
		int i,j,n=3,sp=1;
			for(i=0;i<n;i++){
			//space
			for(j=0;j<n-i;j++){
				System.out.print(" ");
			}
			for(j=0;j<(2*i+1);j++){
				
				System.out.print(sp+j);
			}
			sp++;
			System.out.println();
		}
	}
}