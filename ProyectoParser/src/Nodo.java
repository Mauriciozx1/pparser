public abstract class Nodo
{
    public static final int PADRE = 1;
    public static final int HIJO = 2;

    protected String etiqueta = "";
    protected int tipoNodo;

    // ----------------------------

    public String getEtiqueta()
    {
        return this.etiqueta;
    }

    // ----------------------------

    public void setEtiqueta( String etiqueta )
    {
        this.etiqueta = etiqueta;
    }

    // ----------------------------

    public int getTipoNodo()
    {
        return this.tipoNodo;
    }

    // ----------------------------

    public void setTipoNodo( int tipoNodo )
    {
        this.tipoNodo = tipoNodo;
    }

    // ----------------------------

    // Método a implementar por las clases que hereden
    public abstract void mostrar();
}

