class DownCasting {
	int x = 10;
	void show(){
		System.out.println("Parent' show()");
		System.out.println(this.x);
	}
}
class child extends DownCasting{
	int x = 20;
	void show1(){
		//super.show();
		System.out.println("Child's Show()");
		System.out.println(this.x);
	}
	public static void main(String... s){
		child c = new child();
		DownCasting d1 = new child(); 
		
		
		//method 1 (if it does not give any error 
		// if(d1 instanceof child){ 
			// child c1 = (child)d1;
			//c.show();
			// c1.show1();
		// }
		// else{
			// System.out.println("khtm ho gya re");
		// }
		
		
		//method 2
		
		child c1 = (child)d1;
		c.show();
		c1.show1();
	}
	
}

// downcasting means parent ke object ko child type ke object me convert karna ye agr aise kiya jaaye to cast exception hi dega 
//DownCasting d1 = new DownCasting();
//child c = (child) d1;
//ye bhut rare condition me hi true hoga wanra exception hi dega iske liye instanceof use kr sakte hai

//warna dusra method to hai hi 
//DownCasting d1 = new child();
// 		child c1 = (child)d1;
			//c.show();
			//c1.show1();
			
// kuch iss tarah se iske through child or parent dono ke methods call kr sakte hai 