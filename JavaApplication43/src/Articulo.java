


public class Articulo {
    protected String descripcion,sexo;
    protected int calificacion,cantidad;

    public Articulo(String descripcion, String sexo, int calificacion, int cantidad) {
        this.descripcion = descripcion;
        this.sexo = sexo;
        this.calificacion = calificacion;
        this.cantidad = cantidad;
    }

    public Articulo() {
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getSexo() {
        return sexo;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    
}