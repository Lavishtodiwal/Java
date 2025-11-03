class ValueOf{
	public static void main(String... z){
	String text = "Hello world from Java";
	String[] words = text.split(" ");

	for (String word : words) {
		System.out.println(word);
		}
	}
	
	String data = "apple,banana,grape";
	String[] fruits = data.split(",");

	System.out.println(Arrays.toString(fruits));

}