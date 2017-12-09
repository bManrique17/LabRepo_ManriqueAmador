

import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Usuario
 */
public class Ropa extends Articulo{
    private String categoria;
    private Color color;

    public Ropa(String categoria, Color color, String descripcion, String sexo, int calificacion, int cantidad) {
        super(descripcion, sexo, calificacion, cantidad);
        this.categoria = categoria;
        this.color = color;
    }

    public Ropa() {
    }
    
    

    public String getCategoria() {
        return categoria;
    }

    public Color getColor() {
        return color;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    
    
}
