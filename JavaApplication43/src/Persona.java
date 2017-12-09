


import java.io.Serializable;
import java.util.ArrayList;

public class Persona implements Serializable{
    protected String nombre,ID,sexo,estadoCivil;
    protected int edad,calificacion,numArticulos;
    ArrayList<String> listInfo = new ArrayList();
    ArrayList<Articulo> listArticulos = new ArrayList();
    ArrayList<Articulo> listArticulosPref = new ArrayList();

    private static final long SerialVersionUID = 177L;
    
    public Persona(String nombre, String ID, String sexo, String estadoCivil, int edad, int calificacion) {
        this.nombre = nombre;
        this.ID = ID;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.edad = edad;
        this.calificacion = calificacion;
    }

    public int getNumArticulos() {
        return numArticulos;
    }

    public void setNumArticulos(int numArticulos) {
        this.numArticulos = numArticulos;
    }

        
    
    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getID() {
        return ID;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public int getEdad() {
        return edad;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public ArrayList<String> getListInfo() {
        return listInfo;
    }

    public ArrayList<Articulo> getListArticulos() {
        return listArticulos;
    }

    public ArrayList<Articulo> getListArticulosPref() {
        return listArticulosPref;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public void setListInfo(ArrayList<String> listInfo) {
        this.listInfo = listInfo;
    }

    public void setListArticulos(ArrayList<Articulo> listArticulos) {
        this.listArticulos = listArticulos;
    }

    public void setListArticulosPref(ArrayList<Articulo> listArticulosPref) {
        this.listArticulosPref = listArticulosPref;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}