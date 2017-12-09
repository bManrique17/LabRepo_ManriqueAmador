
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class hiloSimillitud extends Thread{
    
    private ArrayList<Articulo> listArticulos = new ArrayList();
    private Persona persona;
    private JTextArea ta;

    public JTextArea getTa() {
        return ta;
    }

    public void setTa(JTextArea ta) {
        this.ta = ta;
    }

    
    
    public hiloSimillitud(Persona persona) {
        this.persona = persona;
    }

    public hiloSimillitud() {
    }

    public ArrayList<Articulo> getListArticulos() {
        return listArticulos;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setListArticulos(ArrayList<Articulo> listArticulos) {
        this.listArticulos = listArticulos;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    
    
    @Override
    public void run() {
        String bitacora = "";
        for (int i = 0; i < listArticulos.size(); i++) {
            if(listArticulos.get(i).getSexo().equals(persona.getSexo()) && listArticulos.get(i).getCalificacion() == persona.getCalificacion() && persona.getListArticulos().size()<=persona.getNumArticulos()){
                persona.getListArticulos().add(listArticulos.get(i));
                bitacora+="Agregando el articulo "+listArticulos.get(i)+" a "+persona+"\n";
                ta.setText(bitacora);
                listArticulos.get(i).setDueno(true);
            }
            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
                
            }
        }
        if(persona.getListArticulos().size()<persona.getNumArticulos()){
            JOptionPane.showMessageDialog(null, "No se encontraron objetos suficientes, favor crear "+(persona.getNumArticulos()*2)+" articulos en el area correspondiente");
        }
        
    }
    
    
    
}
