import java.io.*;
class ByteStream {
	public static void main(String... args) throws IOException{
		FileOutputStream fout = new FileOutputStream("chachi.txt");
		PrintStream ps1 = new PrintStream(fout);	
		FileOutputStream fout1 = new FileOutputStream("chacha.txt");
		PrintStream ps2 = new PrintStream(fout1);
		System.out.println("Before");
		PrintStream ps4 = System.out;
		System.setOut(ps1);
		System.setErr(ps2);
		System.out.println("chachi 420");
		System.out.println("chachi 840");
		System.out.println("chacha 420");
		System.out.println("chacha 840");
		//-------------------------------
		System.err.println("chacha ki file me likhre hai ab se");
		System.err.println("aur ye next line wali string data hai ");
		//System.out = ps4;
		System.setOut(ps1);
		System.out.println("chacha 240");
		System.setOut(ps4);
		ps4.println("After");
		System.out.println("via actual out ");
		
		
	}
}