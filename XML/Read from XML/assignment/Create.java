import java.sql.*;
import java.io.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.dom.*;
import org.w3c.dom.*;
import java.util.*;

class Create
{
	public static void insertData(Statement s,int n,String table) throws Exception
	{
		int t = 0;
		while(n!=0){
			System.out.print("Do you want to insert data of any student : ");
			char c = new Scanner(System.in).next().charAt(0);
			if(c=='y'){	
				System.out.print("Enter id : ");
				int id = new Scanner(System.in).nextInt();
				System.out.print("Enter name : ");
				String name = new Scanner(System.in).nextLine();
				System.out.print("Enter age : ");
				int age = new Scanner(System.in).nextInt();
				System.out.println();

				t += s.executeUpdate("insert into "+table+" values('"+id+"','"+name+"','"+age+"')");
				System.out.println("Successfully insert "+t+" Records");
				n--;
			}
			else
			{
				System.out.println("okay");
				break;
			}
		}
	}
		
	public static void createTable(Statement s,String table)
	{
		try
		{
			s.executeUpdate("create table "+table+"(ID int not null,name varchar(20),age int)");
			System.out.println("Successfully create table "+table);
			insertData(s,25,table);
		}
		catch(Exception e)
		{
			System.out.println("already have table");
		}
	}
	public static void delete(Statement s) throws Exception
	{
		s.executeUpdate("truncate table xmlconnection");
		System.out.println("Successfully empty table");
	}
	public static void main(String... ar)
	{
		try
		{
			int count = 0,count1 =0;
			FileInputStream fi = new FileInputStream("db.properties");
			Properties pr = new Properties();
			pr.load(fi);
			
			System.setProperty("jdbc.drivers",pr.getProperty("driver"));
			Connection c = DriverManager.getConnection(pr.getProperty("url"),pr.getProperty("user"),pr.getProperty("password"));
			Statement s = c.createStatement();
			createTable(s,pr.getProperty("table"));
			ResultSet rs = s.executeQuery("select * from "+pr.getProperty("table")+"");
			
			
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document document = db.newDocument();
			
			Element root = document.createElement(pr.getProperty("table"));			
			document.appendChild(root);
			Element table_name = document.createElement("Table");
			table_name.appendChild(document.createTextNode(pr.getProperty("table")));
			root.appendChild(table_name);
			
			while(rs.next())
			{
				Element e1 = document.createElement("row"+(++count));
				Element sub1_e1 = document.createElement("ID");
				sub1_e1.appendChild(document.createTextNode(rs.getString(1)));
				Element sub2_e1 = document.createElement("Name");
				sub2_e1.appendChild(document.createTextNode(rs.getString(2)));
				Element sub3_e1 = document.createElement("Age");
				sub3_e1.appendChild(document.createTextNode(rs.getString(3)));
				e1.appendChild(sub1_e1);
				e1.appendChild(sub2_e1);
				e1.appendChild(sub3_e1);
				root.appendChild(e1);
			}
			
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer t = tf.newTransformer();
			StreamResult st = new StreamResult(new File("student.xml"));
			DOMSource ds = new DOMSource(document);
			t.setOutputProperty(OutputKeys.INDENT,"yes");
			t.transform(ds,st);
			System.out.println("Successfully create file");
			
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}