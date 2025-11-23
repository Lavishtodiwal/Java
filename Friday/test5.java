class test5{
	public static void main(String... s){
		int i,j,n=5,sp=1;
			for(i=0;i<n;i++){
			//space
			for(j=0;j<n-1-i;j++){
				System.out.print(" ");
			}
			for(j=0;j<=i;j++){
				System.out.printsp);
				sp*=2;
			}
			sp/=4;
			for(j=0;j<i;j++){
				System.out.printf("%-4d",sp);
				sp/=2;
			}
			System.out.println();
		}
	}
}