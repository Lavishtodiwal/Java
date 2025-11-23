import java.io.File;
import javax.xml.transform.OutputKeys;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class createXML {
	public static void main(String... z){
		try{
			DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
			
			//define root elements
			Document document = documentBuilder.newDocument();
			Element rootElement = document.createElement("school");
			document.appendChild(rootElement);
			
			//define root elements means school elements
			Element student = document.createElement("Student");
			rootElement.appendChild(student);
			
			//add attributes to school
			Attr attribute = document.createAttribute("id");
			attribute.setValue("1");
			student.setAttributeNode(attribute);
			
			//firstname elements
			Element firstname = document.createElement("firstname");
			firstname.appendChild(document.createTextNode("ankush"));
			student.appendChild(firstname);
			
			//lastname elements
			Element lastname = document.createElement("lastname");
			firstname.appendChild(document.createTextNode("kumar"));
			student.appendChild(lastname);
			
			//email elements
			Element email = document.createElement("email");
			email.appendChild(document.createTextNode("abs@gmail.com"));
			student.appendChild(email);
			
			//phone elements
			Element phone = document.createElement("phone");
			phone.appendChild(document.createTextNode("902308403"));
			student.appendChild(phone);
			
			
			//creating and writing to xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource =  new DOMSource(document);
			StreamResult streamResult = new StreamResult(new File("CreatedXMLFile.xml"));
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.transform(domSource,streamResult);
			
			System.out.println("file saved to specified path");
			
		}catch(ParserConfigurationException pce){pce.printStackTrace();}
		catch(TransformerException tfe) {tfe.printStackTrace();}
	}
}

// transformer ->to create the xml file 