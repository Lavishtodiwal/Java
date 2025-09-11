class throwKeyword {
	int age;
	void get(int age){
		if(age<18){
			try{
				throw new ArithmeticException("Age is invalid");
				//here we can use this throw for custom error as i wrote above which is used to give the error as according to us and also we can define which type of exception we want from the code
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		else{
			this.age = age;
			System.out.println("valid age ");
		}
	}
	public static void main(String... s){
		throwKeyword t = new throwKeyword();
		t.get(10);
	}
}