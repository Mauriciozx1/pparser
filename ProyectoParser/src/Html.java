import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Html {
	public void parserHtml(String urlDoc) {
		Document doc = Jsoup.parse(urlDoc);
		//crear la raiz "HTML"
		Padre raizhtml = new Padre("HTML");
		Elements e = null;
		String s =  null;
		Padre head = new Padre("HEAD");
		Padre body = new Padre("BODY");
		//agregar "HEAD", como hijo de raiz
		
		if(doc.title() != s){
		//agregar "TITLE", como hijo de HEAD
			Padre title = new Padre("TITLE"); 
			head.insertarNodo(title);
			head.insertarNodo(new Hijo(doc.title()));
			
		}
		if(doc.body().text() != s) {
			body.insertarNodo(new Hijo(doc.select("body").text()));
		}
		if(doc.select("ul") != e){
		//agregar "UL", como hijo de HEAD
			Padre ul = new Padre("UL");
			ul.insertarNodo(new Hijo(doc.select("ul").text()));
			if(doc.select("li") != e) {
				Padre li = new Padre("LI");
				li.insertarNodo(new Hijo(doc.select("li").text()));
				ul.insertarNodo(li);
			}
		body.insertarNodo(ul);
		}
		
		if(doc.select("footer") != e){
			//agregar "FOOTER", como hijo de BODY
			Padre footer = new Padre("FOOTER");
			body.insertarNodo(footer);
			footer.insertarNodo(new Hijo(doc.select("footer").text()));
			
		}
		raizhtml.insertarNodo(head);
		raizhtml.insertarNodo(body);	
		raizhtml.mostrar();
        }
}
