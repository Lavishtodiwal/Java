class pt{
	public static void main(String... t){
		int n,i,j,k,l,m,p,q,r,s;
		System.out.print("Enter size: ");
		n= new java.util.Scanner(System.in).nextInt();
		p=n;
		q=n;
		for(i=n;i>=1;i--){
			for(j=1;j<=i;j++){
				System.out.print("*");
			}
			for(k=p*2;k<n*2-1;k++){
				System.out.print(" ");
			}
			for(l=i;l!=0;l--){
				if(l==n){
					continue;
				}
				System.out.print("*");
			}
			p--;
			System.out.print("\n");
		}
		for(i=1;i<=n;i++){
			for(j=1;j<=i;j++){
				System.out.print("*");
			}
			for(k=q*2-2;k>1;k--){
				System.out.print(" ");
			}
			for(m=i;m!=0;m--){
				if(m==n){
					continue;
				}
				System.out.print("*");
			}
			System.out.print("\n");
			q--;
			
		}
	}
}