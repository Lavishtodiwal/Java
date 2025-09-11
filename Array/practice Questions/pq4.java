class pq4{
	static int max1(int arr[][]){
		int max=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(arr[i][j]>max){
					max = arr[i][j];
				}
			}
		}
		return max;
	}
	public static void main(String... s){
		System.out.println("Max no. is -> "+max1(new int[][]{{1,2,3,45},{5,6,7,8,9}}));
	}
}