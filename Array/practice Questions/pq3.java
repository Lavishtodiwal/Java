class pq3{
	static void min1(int arr[][]){
		int min =arr[0][0];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(arr[i][j] <min){
					min = arr[i][j];
				}
			}
		}
		System.out.println("Min num is -> "+min);
	}
	public static void main(String... s){
		min1(new int[][]{{10,20,3,4,5},{6,70,8,9,10}});
	}
}