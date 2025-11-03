class AllMethods{
	//method 1
	static int wordCount(String s){
		String []words = s.split(" ");
		int count =0;
		for(String word: words){
			count++;
		}
		return count;
	}
	
	//method 2
	static int spaceCount(String s){
		int count=0;
		char e[] = s.toCharArray();
		
		for(int i =0;i<e.length;i++){
			if(e[i]==' '){
				count++;
			}
		}
		return count;
	}
	
	//method 3
	static int charCount(String s){
		int count=0;
		char e[] = s.toCharArray();
		for(int i =0;i<e.length;i++){
			if(e[i] ==' '){
				continue;
			}
			count++;
		}
		return count;
	}
	//method 4
	static String reverse(String s){
		char []str = s.toCharArray();
		String d="";
		
		for(int i=0;i<str.length;i++){
			d = str[i]+d;
		}
		return d;
	}
	//method 5
	static boolean palindrome(String s){
		char []str = s.toCharArray();
		String d="";
		
		for(int i=0;i<str.length;i++){
			d = str[i]+d;
		}
		if(s.equals(d)){
			return true;
		}
		else{
			return false;
		}
	}
	
	//method 6-> ltrim
	static String lTrim(String s){
		int count=0;
		String d="";
		char arr[] = s.toCharArray();
		for(int i=0;i<arr.length;i++){
			if(arr[i]==' '){
				count++;
			}
			else
				break;
			
		}
		for(int i=count;i<arr.length;i++){
			d = d+arr[i];
		}
		return d;
	}
	
	//method 7-> rTrim
	static String rTrim(String s){
		int count=0;
		String d="";
		char arr[] = s.toCharArray();
		for(int i=arr.length-1;i>=0;i--){
			if(arr[i]==' '){
				count++;
			}
			else
				break;
			
		}
		count= arr.length-count;
		for(int i=0;i<count;i++){
			d = d+arr[i];
		}
		return d;
	}
	
	//method 8-> All Trim
	static String allTrim(String s){
		//String d = lTrim(s);
		//d = rTrim(d);
		//return d;
		int startSpc=0, endSpc=0;
		char arr[] = s.toCharArray();
		String d="";
		for(int i =0;i<arr.length;i++){
			if(arr[i]==' ')
				startSpc++;
			else
				break;
		}
		for(int i =arr.length-1;i>=0;i--){
			if(arr[i]==' ')
				endSpc++;
			else
				break;
		}
		endSpc = arr.length-endSpc;
		for(int i=startSpc;i<endSpc;i++)
			d+=arr[i];
		return d;
	}
	
	//method 9 -> Sqeeze (remove all the spaces and returns the complete word
	static String Squeez(String s){
		String d="";
		char[] arr= s.toCharArray();
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=' ')
				d=d+arr[i];
		}
		return d;
	}
	public static void main(String... z){
		String s = "India is my country";
		
		System.out.println("total words-> "+wordCount(s));
		System.out.println("total Spaces-> "+spaceCount(s));
		System.out.println("total characters-> "+charCount("hii, this"));
		System.out.println("Reversed string of 'hey' -> "+ reverse("hey"));
		System.out.println("Palindrome of 'madak' -> "+ palindrome("madak"));
		
		System.out.println("left trim of '     hello ji' -> "+ lTrim("     hello ji"));
		System.out.println("right trim of 'hello     ' -> "+ rTrim("hello ji     ")+".");
		System.out.println("all trim of '     hello ji     ' -> "+ allTrim("     hello ji     ")+".");
		
		System.out.println("Squeeze of 'its rainy day' -> "+ Squeez("its rainy day")+".");
		
	}
}
