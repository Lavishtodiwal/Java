import java.io.*;

class ByteStream1 {
	public static void main(String... s) throws IOException{
		FileOutputStream fout = new FileOutputStream("new.txt");
		PrintStream ps = new PrintStream(fout);
		//printstream class ke through hum jo bhi likhte hai wo uss file me redirect hota hai jis file ka object hum pass karte hai jaise uper fout ka kiya hai jiske through new.txt me data jayega jo bhi hum ps.println me as a string pass karte hai 
		
		ps.println("Lulu1");
		System.setOut(ps); //iske through hum sop ka jo bydefault behaivour hota hai yaani ke display pe output print na krke sidha file me data write karega or by default behaivour ko change kr dega same 
		//setErr bhi kuch esi tarah se kaam karta hai 
		// System ke 3 static data member hove hai
		//1.Out
		//2.In
		//3.Err
		//------------------------------
		// inn 3 ko hum inke printStream method se inke behaivour ko change kr sakte hai 
		System.out.println("hai  re  kya ");
	}
}