class Array3DeclarationWays{
	public static void main(String... s){
		
		// arrays with different size arrays (Jagged Array)
		
		//Declaration and memory allocation
		int[][] arr = new int[3][4]; //by default values = 0
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+",");
			}
			System.out.println();
		}
		System.out.println();
		
		//Declaration and intialization at once 
		int[][] arr1={{1,2,3,4,5},{1,2,3,4,5,6}};
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr1[i].length;j++){
				System.out.print(arr1[i][j]+",");
			}
			System.out.println();
		}
		System.out.println();
		
		
		//Declaration first, then initialize later
		int [][] arr2;
		arr2 = new int[][]{{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9,10}};
		for(int i=0;i<arr2.length;i++){
			for(int j=0;j<arr2[i].length;j++){
				System.out.print(arr2[i][j]+",");
			}
			System.out.println();
		}
		
		
		
	}
}