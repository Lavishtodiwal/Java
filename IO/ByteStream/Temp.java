import java.io.*;
class Temp{
	public static void main(String... s) throws IOException{
	FileOutputStream fout = new FileOutputStream("tempOut.txt");
	PrintStream ps1= new PrintStream(fout);
	FileOutputStream fout1 = new FileOutputStream("tempErr.txt");
	PrintStream ps2= new PrintStream(fout1);
	System.out.println("hello");
	System.setOut(ps1);
	System.setErr(ps2);
	System.out.println("Hii i am from the tempOut file");
	System.err.println("Hii i am from the tempErr file");
	}
}