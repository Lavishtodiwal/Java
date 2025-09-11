class pq5{
	static void sort(int arr[]){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
			if(arr[i]<arr[j]){
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			}
		}
		for(int num:arr){
			System.out.print(num+" "); 
		}
	}
	public static void main(String... s){
		sort(new int[]{1,3,4,5,2,6});
	}
}


1,3,4,5,2,6    
3 1 4 5 2 6 
4 1 3 5 2 6
5 1 3 4 2 6 
6 1 3 4 2 5
1 6 3 4 2 5
