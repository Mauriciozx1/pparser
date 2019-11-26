import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class ParserDoc {
	public void seleccionarDoc(String urlDoc,String tipoDoc) throws ParserConfigurationException, SAXException, IOException {
		
			if(tipoDoc =="html") {
				System.out.println("Doc: " + tipoDoc + " detectado.");
				Html html = new Html();
				html.parserHtml(urlDoc);
				System.out.println("---------------------------------");
			}
			else if(tipoDoc =="xml") {
				System.out.println("Doc: " + tipoDoc + " detectado.");
				XML xml = new XML();
				xml.parserXML(urlDoc);
				System.out.println("---------------------------------");
			}
			else if(tipoDoc =="json") {
				System.out.println("Doc: " + tipoDoc + " detectado.");
				JSON json = new JSON();
				json.parserJSON(urlDoc);
				System.out.println("---------------------------------");
			}
			else {
				System.out.println("Doc ingresado invalido");
			}
		
	}
}
