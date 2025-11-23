class Sequence{
	public static void main(String... t){
		int a=3,b=4,n=8;
		for(int i=1;i<=n;i++){
			int c= a+b;
			System.out.println(a+" "+b+" "+" "+c);
			a=c;
			b=b+1;
		}
	}
}