class Array3{
	public static void main(String... s){
		int x[][],y,z;
		System.out.print("Enter the no. of rows: ");
		y= new java.util.Scanner(System.in).nextInt();
		System.out.print("Enter the no. of columns: ");
		z= new java.util.Scanner(System.in).nextInt();
		x= new int[y][z];
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				System.out.print("enter no in "+i+","+j+" th position: ");
				x[i][j]= new java.util.Scanner(System.in).nextInt();
			} 
		}
		//printing the array
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
	}
}