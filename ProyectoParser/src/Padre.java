import java.util.ArrayList;
import java.util.List;

public class Padre extends Nodo
{
    List<Nodo> nodos = new ArrayList<Nodo>();

    // ----------------------------

    public Padre( String etiqueta )
    {
        this.setTipoNodo( Nodo.PADRE );
        this.setEtiqueta( etiqueta );
    }

    // ----------------------------

    public void insertarNodo( Nodo nodo )
    {
        nodos.add( nodo );
    }

    // ----------------------------
    // ----------------------------

    public List<Nodo> getNodos()
    {
        return nodos;
    }

    // ----------------------------

    public Nodo getNodo( int posicion )
    {
        return nodos.get( posicion );
    }

    // ----------------------------

    @Override
    public void mostrar()
    {	
        System.out.println( "Listando Etiqueta Padre [" + this.getEtiqueta() + "]");

        for (Nodo nodo : nodos)
        {
            nodo.mostrar();
        }
    }
}
