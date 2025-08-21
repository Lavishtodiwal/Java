class AnonymousArray{
	static void printArray(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+", ");
		}
	}
	static void print2DArray(int arr[][]){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.print("\n");
		}
		
	}
	public static void main(String... s){
		printArray(new int[]{1,2,3,4,5}); // anonymous array -> passing anonymous array to static funciton
		System.out.println();
		System.out.print("third element ->"+new int[]{1,2,3,4,5}[2]);
		System.out.println();
		print2DArray(new int[][]{{1,2,3},{4,5,6}});
		
		System.out.println();
		System.out.print("(0,1) element ->"+ new int[][]{{1,2,3,4,5},{6,7,8,9,10}}[0][1]);
	}
}