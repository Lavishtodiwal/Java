import java.io.*;
class MyFileWriter{
	public static void main(String... r) throws IOException{
		//FileOutputStream fout = new FileOutputStream("lalu.txt");//write mode
		//FileOutputStream fout = new FileOutputStream("lalu.txt",true);//append mode
		FileOutputStream fout = new FileOutputStream(new File("e:\\Java\\IO\\ByteArrayOutputStream\\lalu.txt"));
		
		//FileOutputStream fout = new FileOutputStream(new File("e:\\Java\\IO\\ByteArrayOutputStream\\lalu.txt"), true);
		
		String s = "Java[a] is one of the Greater Sunda Islands in the South East Asian country of Indonesia. It is bordered by the Indian Ocean to the south and the Java Sea (a part of Pacific Ocean) to the north. With a population of 156.9 million people (including Madura) in mid 2024, projected to have risen to 158 million by mid-2025, Java is the world's most populous island, home to approximately 56% of the Indonesian population while constituting only 7% of its land area.[2] Indonesia's capital city, Jakarta, is on Java's northwestern coast.";
		
		byte ch[] = s.getBytes();
		//fout.write(ch); // Writes the entire contents of a byte array to the stream.
		
		for(int i =0; i<ch.length;i++)
			fout.write(ch[i]);
		fout.close();
		System.out.println("File is created");
			
	}
}

class MyFileReader{
	public static void main(String... z) throws IOException{
		FileInputStream bin = new FileInputStream("lalu.txt");
		int i=0;
		
		while((i=bin.read())!=-1){ //bin.read -> reads a single byte of data from the file
			System.out.print((char)i);
		}
		//bin.close();
		
	}
}



class MyFileReader1{
	public static void main(String... z) throws IOException{
		FileInputStream bin = new FileInputStream("lalu.txt");
		byte []b  = new byte[bin.available()];
		bin.read(b);
		String s = new String(b);
		System.out.println(s);
		
	}
}