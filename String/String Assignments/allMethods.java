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
	//method 10 -> vowel count
	static int vowelCount(String s){
		int count=0;
		char arr[] = s.toCharArray();
		for(int i=0;i<arr.length;i++){
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
				count++;
		}
		return count;
	}
	
	//method 11-> length count
	static int lengthCount(String s){
		int count=0;
		char arr[] = s.toCharArray();
		for(int i=0;i<arr.length;i++){
			count++;
		}
		return count;
	}
	
	//method -13 -> frequency count
	static void frequencyCount(String s){
		String d ="";
		
		for(int i=0;i<s.length();i++){
			char ch = s.charAt(i);
			
			//skip if already there
			if(d.indexOf(ch) != -1)
				continue;
			int count =0;
			for(int j = 0;j < s.length();j++){
				if(ch == s.charAt(j)){
					count++;
				}
			}
			System.out.println(ch + " -> "+count);
			d +=ch;
		}
	}
	//method 14 -> changeCase (change case to another)
	static String changeCase(String s){
		String d="";
		
		for(int i=0;i<s.length();i++){
			char ch = s.charAt(i);
			
			if(ch>='a' && ch<='z'){
				ch = (char)(ch-32);
			}
			else if(ch>='A' && ch<='Z'){
				ch = (char)(ch +32);
			}
			d +=ch;
		}
		return d;		
	}
	
	//method 15 -> single occurence
	static String singleOccurence(String s){
		String d="";
		String t="";
		
		for(int i =0;i<s.length();i++){
			char ch = s.charAt(i);
			
			if(d.indexOf(ch) != -1)
				continue;
			int count=0;
			for(int j=0;j<s.length();j++){
				if(ch == s.charAt(i)){
					count++;
				}
			}
			d +=ch;
			t +=ch;
		}
		return t;
	}
	
	//method 16 -> sorted order
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
		System.out.println("Vowels in 'its rainy day' -> "+ vowelCount("its rainy day")+".");
		System.out.println("Length of 'its rainy day' -> "+ lengthCount("its rainy day")+".");
		
		frequencyCount("its rainy day");
		System.out.println("change Case of 'India' to -> "+ changeCase("India")+".");
		
		System.out.println("single occurence of 'Inddiaa' is -> "+ singleOccurence("Inddiaa")+".");
		
		//System.out.println("single occurence of 'Inddiaa' is -> "+ sortedOrder("Inddiaa")+".");
		
	}
}
