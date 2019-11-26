import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class Main {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException{
		ParserDoc parser = new ParserDoc();
		Server s = new Server();
		//Elegir que tipo de doc parsear.
		//parser.seleccionarDoc("example.html", "html");
		parser.seleccionarDoc("example.xml", "xml");
		//parser.seleccionarDoc("example.json", "json");
		s.enviar();
	}

}
