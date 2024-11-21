package udla.jriofrio.pooabstractas.modelo;
//CLASE ABSTRACTA
abstract public class Hoja {

    protected String contenido;

    public Hoja(String contenido) {
        this.contenido = contenido;
    }

    abstract public  String imprimir();
    //Lod metodos abstractos no tienen cuerpo
}
