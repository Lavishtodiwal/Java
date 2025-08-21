class Inheritence{
	int x,y;
		void show(){
			System.out.println(x);
			System.out.println(y);
		}
	public static void main(String... s){
		Inherited c1 = new Inherited();
		c1.get(10,20);
		c1.show();
	}
}
class Inherited extends Inheritence{
		void get(int x, int y){
			this.x=x;
			this.y=y;
		}
}