import java.awt.*;
class viaAssociation{
	Frame f;
	viaAssociation(String s){
		f= new Frame(s);
		f.setSize(400,400);
		f.setVisible(true);
	}
	public static void main(String... q){
		new viaInheritence("ff");
		new viaInheritence("vv");
	}
}