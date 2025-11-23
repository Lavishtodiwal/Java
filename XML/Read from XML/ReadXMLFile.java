import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class ReadXMLFile{
	public static void main(String... z){
		try{
			File fXmlFile = new File("staff.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile); //parse the xml file and create the document object represting the entire xml file
			Element e = doc.getDocumentElement(); //get root element of the xml file
			e.normalize(); 
			System.out.println("Root Element: "+e.getNodeName()); // return the tag name of the root element <company>
			NodeList nList = doc.getElementsByTagName("staff"); // returns a list of the all staff elements 
			System.out.println(nList.getLength()); //no. of staff elements found
			System.out.println("---------------------------------------------");
			for(int i =0; i<nList.getLength();i++){
				Node nNode =nList.item(i);
				// System.out.println(nNode);
				
				System.out.println("\nCurrent Element : " +nNode.getNodeName());
				if(nNode.getNodeType() == Node.ELEMENT_NODE){
					Element  eElement = (Element) nNode;
					System.out.println("Staff id =" +eElement.getElementsByTagName("firstname"));
					NodeList List1= eElement.getElementsByTagName("firstname");
					Node d = List1.item(0);
					System.out.println("First Name: "+ d.getTextContent());
					System.out.println("Last Name: "+eElement.getElementsByTagName("lastname").item(0).getTextContent());
					System.out.println("Nick Name: "+eElement.getElementsByTagName("nickname").item(0).getTextContent());
					System.out.println("Salary: "+ eElement.getElementsByTagName("salary").item(0).getTextContent());
					
				}	
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}


// documentBuilderFactory => factory of parsers
// documentBuilder => which creates the parsers (parserMAchine)

// document => jo parser bana hai