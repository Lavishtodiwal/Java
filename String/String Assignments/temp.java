class temp{
	public static void main(String... z){
		String s = "candana";
		String d="";
		String t ="";
		//frequency count
		
		for(int i=0;i<s.length();i++){
			char ch = s.charAt(i);
			
			//skip if already counted
			if(d.indexOf(ch) != -1)
				continue;
			
			int count = 0;
			for(int j = 0;j<s.length();j++){
				if(ch == s.charAt(j)){
					count++;			
				}
			}
			System.out.println(ch+"-> "+ count);
			d +=ch;
			t +=ch;
		}
		System.out.println(t);
	}
}