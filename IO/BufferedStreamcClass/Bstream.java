import java.io.*;
class BOutStream{
	public static void main(String... z)throws IOException{
		FileOutputStream fout = new FileOutputStream("lalu.txt");
		String s = "I am learning java Full Stack development and now i am on io topic";
		byte b[] = s.getBytes();
		// 2. Wrap it in a high-level stream (the decorator)
        BufferedOutputStream bos = new BufferedOutputStream(fout);
            
		bos.write(b);//this stores the data to the RAM's buffer
            
        // OPTIONAL: Call flush() to force the data to the file immediately,
        // even if the buffer isn't full yet.
        bos.flush(); //buffer ke data ko file me store karna
		System.out.println("Data written to file using BufferedOutputStream.");
	}
}




class BInStream{
	public static void main(String... s) throws IOException{
		String src = "lalu.txt";
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src))){
			//Reads one byte at a time and display it
			
			byte byteData;
			while((byteData = (byte) bis.read()) != -1){
				System.out.print((char)byteData);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}