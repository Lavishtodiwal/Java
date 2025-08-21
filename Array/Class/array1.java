class Array1{
	public static void main(String... s){
		int x[];
		System.out.print("Enter the size of the array : ");
		int y=new java.util.Scanner(System.in).nextInt();
		x = new int[y];
		for(int i=0;i<x.length;i++){
			System.out.print("Enter for "+i+" position: ");
		    x[i]=new java.util.Scanner(System.in).nextInt();
		}
		for(int i =0;i<x.length;i++){
			System.out.print(x[i]+", ");
		}
	}
}