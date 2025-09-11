class pq2{
	static void min(int[] x){
		int Min = x[0];
		for(int i=0;i<x.length;i++){
			if(Min > x[i]){
				Min = x[i];
			}
		}
		System.out.print(Min);
	}
	public static void main(String... s){
		min(new int[]{11,2,3,4,5,6});
	}
}