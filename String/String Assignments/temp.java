class temp{
	public static void main(String... z){
		String d = "its day";
		char e[] = d.toCharArray();
		
		byte [] arr = d.getBytes();
		String s="";
		
		for(int i=0;i<e.length;i++){
			if(arr[i]<='a' && arr[i]<='z'){
				s = s+(char)(((int)arr[i])-32);
			}
		}
		System.out.println(s);
	}
}