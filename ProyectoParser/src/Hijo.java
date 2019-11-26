public class Hijo extends Nodo
{
    public Hijo( String etiqueta )
    {
        this.setTipoNodo( Nodo.HIJO );
        this.setEtiqueta( etiqueta );
    }

    // ----------------------------

    @Override
    public void mostrar()
    {
        System.out.println( "Etiqueta Hija: [" + this.getEtiqueta() + "]" );
    }
}
