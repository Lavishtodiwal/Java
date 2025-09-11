class PureImmutable{
	private final int x;
	Demo d;
	private PureImmutable(int x){
		d = new Demo();
		this.x= x;
	}
	void show(){
		System.out.println(x);
	}
	public static PureImmutable getInstance(int z){ //factory instace method 
		return new PureImmutable(z);
	}
}
class Demo{
	public static void main(String... s){
	PureImmutable p = PureImmutable.getInstance(10);
	p.show();
	}
}

//-------------------------Working--------------------------

sabse pehle ye Demo class ke main method ko chalayega uske baad PureImmutable ka ek object bnayega joki
						
						public static PureImmutable getInstance(int z)
Yeh ek static factory method hai. Iska kaam PureImmutable class ka ek naya object (instance) bana kar dena hai.

static: Yeh sabse important hai. static ka matlab hai ki yeh method class (PureImmutable) se juda hai, na ki uske kisi object se. Isse call karne ke liye aapko new PureImmutable() karne ki zaroorat nahi hai.Aap seedhe Class ke naam se ise call kar sakte hain
and ab ye private constructor ko create krega or  yha se Demo class ka ek object bnadega 
// main me newly created object ka reference aayega or fir p.show() se show method call ho jeyega