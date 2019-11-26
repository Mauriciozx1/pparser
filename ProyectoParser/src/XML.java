import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XML {
	public void parserXML(String urlDoc) throws ParserConfigurationException, SAXException, IOException{
		File xml = new File(urlDoc);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(xml);
		doc.getDocumentElement().normalize();
		Padre raizxml = new Padre(doc.getDocumentElement().getNodeName());
		NodeList nList = doc.getElementsByTagName("staff");
		for(int x = 0;x < nList.getLength();x++){
			Node nNodo = nList.item(x);
			if (nNodo.getNodeType() == Node.ELEMENT_NODE) {
				Element e = (Element) nNodo;
				Padre h1 = new Padre(nNodo.getNodeName() + " ID:" + e.getAttribute("id"));
				h1.insertarNodo(new Hijo(e.getElementsByTagName("firstname").item(0).getTextContent()));
				h1.insertarNodo(new Hijo(e.getElementsByTagName("lastname").item(0).getTextContent()));
				h1.insertarNodo(new Hijo(e.getElementsByTagName("nickname").item(0).getTextContent()));
				h1.insertarNodo(new Hijo(e.getElementsByTagName("salary").item(0).getTextContent()));
				raizxml.insertarNodo(h1);	
			}
		}
		raizxml.mostrar();
		
	}
}
   
        
     
  

