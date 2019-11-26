import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {
	int puerto = 4500;
	public void enviar() {
		try {
			ServerSocket server = new ServerSocket(puerto);
			System.out.println(server.toString());
			Socket clienteNuevo = server.accept();
			ObjectInputStream entrada = new ObjectInputStream(clienteNuevo.getInputStream());
			System.out.println("Objeto enviado");
			System.out.println("Mandando otro mensaje al cliente");
			ObjectOutputStream resp = new ObjectOutputStream(clienteNuevo.getOutputStream());
			resp.writeObject("Hola cliente");
			System.out.println("Mensaje enviado");
			clienteNuevo.close();
		}catch(IOException ex){Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
	
		}
	}
}

