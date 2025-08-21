import java.util.Arrays;
class ArrayMethods{
	public static void main(String... s){
		int[] arr={1,2,3,4,5,6,7,8,9};
		int[] arr1={9,4,0,5,3,2,1,6,7,8};
		System.out.println(arr.length); //to check the length of the array.
		System.out.println(Arrays.toString(arr)); //print the array in easy way.
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1)); //to sort the array
		
		System.out.println(Arrays.binarySearch(arr,3));
	}
}