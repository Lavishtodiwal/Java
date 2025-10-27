import java.io.*;
class Temp{
	public static void main(String... z) throws IOException{
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		String s = "India is my country";
		byte[] b = s.getBytes();
		bout.write(b);
		bout.writeTo(new FileOutputStream("abc.txt"));
		bout.writeTo(new FileOutputStream("abc1.txt"));
		bout.close();
	}
}