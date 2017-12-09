
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adminPersonas {

    private ArrayList<Persona> listaPersonas = new ArrayList();
    private File archivo = null;

    public adminPersonas(String path) {
        archivo = new File(path);
    }

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    

    public void cargarArchivo() {
        try {
            listaPersonas = new ArrayList();
            Persona temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Persona) objeto.readObject()) != null) {
                        listaPersonas.add(temp);
                    }
                } catch (Exception e) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void escribirArchivo() throws IOException {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Persona p : listaPersonas) {
                bw.writeObject(p);
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }

}
