class UpCasting {
	int x = 10;
	void show1(){
		System.out.println("Parent' show()");
		System.out.println(this.x);
	}
}
class child extends UpCasting{
	int x = 20;
	void show(){
		//super.show();
		System.out.println("Child's Show()");
		System.out.println(this.x);
	}
	public static void main(String... s){
		child c = new child();
		UpCasting d = new UpCasting();
		UpCasting d1 = new child();//UpCasting means parent me child ka reference rakhna and object se call krne per show child ka chlega (implicit casting)
		//and upcasting me hamesha parent ke methods hi chlenge naaki child ke
		// child ke chlaane ke liye downcasting krni padegi
		//c.show();
		d1.show();
	}
	
}