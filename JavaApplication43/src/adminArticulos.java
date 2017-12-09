
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adminArticulos {

    private ArrayList<Articulo> listaArticulos = new ArrayList();
    private File archivo = null;

    public adminArticulos(String path) {
        archivo = new File(path);
    }

    public void setListaArticulos(ArrayList<Articulo> listaArticulos) {
        this.listaArticulos = listaArticulos;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Articulo> getListaArticulos() {
        return listaArticulos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void cargarArchivo() {
        try {
            listaArticulos = new ArrayList();
            Articulo temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Articulo) objeto.readObject()) != null) {
                        listaArticulos.add(temp);
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
            for (Articulo a : listaArticulos) {
                bw.writeObject(a);
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }

}
