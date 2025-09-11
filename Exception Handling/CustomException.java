class CustomException{
	int age;
	void get(int age) throws AgeException{
		if(age<18){
			throw new AgeException("Invalid Age");
		}
		else{
			this.age= age;
		}
	}
	public static void main(String... s){
		CustomException c1= new CustomException();
		try{
			c1.get(13);
		}catch(AgeException ae){
			System.out.println(ae);
		}
	}
}
class AgeException extends Exception{
	AgeException(String s){
		super(s); //this calls the constructer of the parent class that is Exception class and passes the error to it
	}
}