/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author home
 */
public class errorCalificacion extends Exception{

    public errorCalificacion(String message) {
        super("Debe estar entre 1 y 5 la calificacion");
    }
    
    
    
}
