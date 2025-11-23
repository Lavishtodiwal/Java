import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*; //provides dom classes for working on XML 

public class Dom{
	public static void main(String... z){
		try{
			DocumentBuilderFactory fact1 = DocumentBuilderFactory.newInstance();//Creates a factory to configure and produce DocumentBuilder object
			fact1.setValidating(true);	//to validating the dtd files 
			fact1.setIgnoringElementContentWhitespace(true); //to ignore white spaces
			DocumentBuilder build1 = fact1.newDocumentBuilder();  //used to parse the XML files and create a document object 
			String book1 ="book.xml";
			Document bookdoc = build1.parse(new File(book1)); //parses the XML file and returns a Document type object
			Element bookele = bookdoc.getDocumentElement(); //get the root element of the XML
			System.out.println("root "+bookele.getNodeName()+ " "); //returns the tag name of the element 
			NodeList chapternodes = bookele.getChildNodes(); // A list of all child nodes (element, text,comments, etc.) under the root
			System.out.println(chapternodes.getLength());
			
			for(int i=0;i<chapternodes.getLength();i++){
				Element chapter =(Element) chapternodes.item(i);//iterates through all the child node
				System.out.println(chapter.getNodeName()+" ");
				NodeList titlelist = chapter.getElementsByTagName("chapTitle"); //find all the <chapTitle> elements inside the current chapter
				Text title = (Text)titlelist.item(0).getFirstChild();//gets the first child of the chapTitle , which is a text node
				System.out.println(title.getData());// Retrives the actual text content
			}
		}catch(Exception e){System.out.println(e);}
	}
}