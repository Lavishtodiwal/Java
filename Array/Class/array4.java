class Array4 {
	public static void main(String... s){
		//differernt size of the array
		int x[][];
		x= new int[3][];
		x[0]= new int[]{1,2,3};
		x[1]= new int[]{1,2,3,4,5};
		x[2]= new int[]{1,2,3,4,5,6,7};
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
	}
}