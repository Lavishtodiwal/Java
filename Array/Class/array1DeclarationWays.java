class Array1DeclarationWays{
	public static void main(String... s){
		//Declaration and memory allocation
		int[] arr = new int[5]; //by default values = 0
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
		System.out.println();
		
		
		//Declaration and intialization at once 
		int[] arr1={10,20,30,40,50};
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+",");
		}
		System.out.println();
		
		
		//Declaration first, then initialize later
		int [] arr2;
		arr2= new int[]{1,2,3,4,5};
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+",");
		}
		
	}
}