
public class Juguete extends Articulo{
    private int duracion,edadUso;

    public Juguete(int duracion, int edadUso, String descripcion, String sexo, int calificacion, int cantidad) {
        super(descripcion, sexo, calificacion, cantidad);
        this.duracion = duracion;
        this.edadUso = edadUso;
    }

    public Juguete() {
    }

    public int getDuracion() {
        return duracion;
    }

    public int getEdadUso() {
        return edadUso;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setEdadUso(int edadUso) {
        this.edadUso = edadUso;
    }

    
}
