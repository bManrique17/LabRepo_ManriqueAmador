
public class artTecno extends Articulo{
    
    private String categoria,marca;

    public artTecno(String categoria, String marca, String descripcion, String sexo, int calificacion, int cantidad) {
        super(descripcion, sexo, calificacion, cantidad);
        this.categoria = categoria;
        this.marca = marca;
    }

    public artTecno() {
    }
    
    

    public String getCategoria() {
        return categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    @Override
    public String toString() {
        return "ArtTecno->|" + super.toString();
    }
    
}
