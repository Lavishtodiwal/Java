class Pq1{
	static void max(int[] x){
		int maxNum=0;
		for(int i=0;i<x.length;i++){
			if(maxNum<x[i]){
				maxNum= x[i];
			}
		}
		System.out.print(maxNum);
	}
	public static void main(String... s){
		max(new int[]{1,2,3,4,5,10,9,11,23});
	}
}