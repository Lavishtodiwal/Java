class Temp{
	void Temp(){
		System.out.println("From same name function as class name ");
	}
	public static void main(String... s){
		Temp t1= new Temp();
		t1.Temp();		
	}
}