import java.awt.*;
class myFrame{
	Frame f;
	Button b1;
	TextField tf;
	myFrame(String s){
		f= new Frame(s); 
		tf =new TextField();
		tf.setBounds(140,240,300,20);
		f.add(tf);
		b1= new Button("OK");
		b1.setBounds(150,260,200,10);
		f.add(b1);
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
	}
	public static void main(String... q){
		new myFrame("vv");
	}
}