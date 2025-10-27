import java.awt.*;
class viaInheritence extends Frame{
	viaInheritence(String s){
		super(s);
		setSize(400,400);
		setVisible(true);
	}
	public static void main(String... q){
		new viaInheritence("ff");
		new viaInheritence("vv");
	}
}