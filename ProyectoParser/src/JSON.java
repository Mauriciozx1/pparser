import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSON {
	public void parserJSON(String urlDoc){
		 JSONParser parser = new JSONParser();
		 
	        try {
	 
	            Object obj = parser.parse(new FileReader(urlDoc));
	 
	            JSONObject jsonObject = (JSONObject) obj;
	            Padre raizjson = new Padre("JSON");
	            String name = (String) jsonObject.get("Name");
	            Padre p1 = new Padre("name");
	            p1.insertarNodo(new Hijo(name));
	            raizjson.insertarNodo(p1);
	            String author = (String) jsonObject.get("Author");
	            Padre p2 = new Padre("author");
	            p2.insertarNodo(new Hijo(author));
	            raizjson.insertarNodo(p2);
	            JSONArray companyList = (JSONArray) jsonObject.get("Company List");
	            Padre p3 = new Padre("Company");
	            raizjson.insertarNodo(p3);
	            Iterator<String> iterator = companyList.iterator();
	            while (iterator.hasNext()) {
	            	p3.insertarNodo(new Hijo(iterator.next().toString()));
	            }
	            raizjson.mostrar();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	       
	}
}

