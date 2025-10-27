import java.io.*;
class Reader{
	public static void main(String... w) throws IOException{
		FileInputStream fin = new FileInputStream("chacha.txt");
		int i=0;
		
		while((i=fin.read())!=-1)
			System.out.print((char)i);
	}
}