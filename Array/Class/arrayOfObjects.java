class ArrayOfObjects{
	int age;
	String name;
	ArrayOfObjects(int x,String y){
		this.age= x;
		this.name= y;
	}
	void display(){
		System.out.println("Name-> "+ name+" ---- "+"Age-> "+age);
	}
	public static void main(String... s){
		ArrayOfObjects[] arr = new ArrayOfObjects[3]; //memory allocation at initialization
		arr[0]= new ArrayOfObjects(18,"Nikky");
		arr[1]= new ArrayOfObjects(19,"Rahul");
		arr[2]= new ArrayOfObjects(20,"Kunj");
		
		for(int i=0;i<arr.length;i++){
			arr[i].display();
		}
	}
}