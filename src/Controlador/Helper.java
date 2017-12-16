package Controlador;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *Clase para validar datos
 * permite verificar si un dato esta dentro de un rango numerico
 * permite vrificar si un dato String tenga un largo minimo
 * @author Pablo Montero
 */
public class Helper {
    
    private static List<Boolean> validaciones = new ArrayList<>();
    /**
     * 
     * @param nombre Nombre del campo a validar tipo String que aparecera en el mensaje del JOptionpane
     * @param dato Dato o valor a validar tipo String
     * @param largoMin largo minimo que debe tener el dato a ingresar
     * @param largoMax largo maximo que debe tener el dato a ingrear
     * @param notnull el dato es olbigatorio notnull = true, si es opcional notnull = false
     * @return retorna true si el dato es correcto, retorna falso si no se puede validar
     */
    public static boolean validaString(String nombre, String dato, int largoMin, int largoMax, boolean notnull) {
        try {
            int valida = Integer.parseInt(dato);
            JOptionPane.showMessageDialog(null, "El campo " + nombre + " debe tener almenos una letra");
            validaciones.add(false);
            return false;
            
        } catch (NumberFormatException e) {
            if(dato.trim().isEmpty() && notnull==true){
                JOptionPane.showMessageDialog(null, "El campo " + nombre + " no puede estar vacio");
                validaciones.add(false);
                return false;
            }else if (dato.trim().length() < largoMin) {
                JOptionPane.showMessageDialog(null, "El campo " + nombre + " es demasiado corto");
                validaciones.add(false);
                return false;
            } else if (dato.trim().length() > largoMax) {
                JOptionPane.showMessageDialog(null, "El campo " + nombre + " es demasiado largo");
                validaciones.add(false);
                return false;
            }
            validaciones.add(true);
            return true;
        }
    }
    
    /**
     * 
     * @param nombre Nombre del campo a validar tipo int que aparecera en el
     * mensaje del JOptionpane
     * @param dato dato a valida tipo int
     * @param nroMin numero minimo que puede tomar dato 
     * @param nroMax numero maximo que puede tomar dato tipo int
     * @param notnull el dato es olbigatorio notnull = true, si es opcional notnull = false
     * @return retorna true si el dato es correcto, retorna falso si no se puede validar
     */
    public static boolean validaInt(String nombre, String dato, int nroMin, int nroMax, boolean notnull) {
        try {
            int valida = Integer.parseInt(dato);
            if (dato.trim().isEmpty() && notnull == true) {
                JOptionPane.showMessageDialog(null, "El campo " + nombre + " no puede estar vacio");
                validaciones.add(false);
                return false;
            } else if (valida < nroMin) {
                JOptionPane.showMessageDialog(null, "El campo " + nombre + " debe ser mayor o igual a " + nroMin);
                validaciones.add(false);
                return false;
            } else if (valida > nroMax) {
                JOptionPane.showMessageDialog(null, "El campo " + nombre + " debe ser menor o igual a " + nroMax);
                validaciones.add(false);
                return false;
            }
            validaciones.add(true);
            return true;
            
        } catch (NumberFormatException e) {
            if (dato.trim().isEmpty() && notnull == true) {
                JOptionPane.showMessageDialog(null, "El campo " + nombre + " no puede estar vacio");
                validaciones.add(false);
                return false;
            }else if(dato.trim().isEmpty()){
                JOptionPane.showMessageDialog(null, "El campo " + nombre + " no puede estar vacio");
                validaciones.add(false);
                return false;
            }else {
                JOptionPane.showMessageDialog(null, "El campo " + nombre + " debe ser numérico");
                validaciones.add(false);
                return false;
            }
            
        }
    }
    
    /**
     * permite saber que todas las validaciones que se hicieron sean verdaderas
     * se debe utilizar junto con limpiar(). limpiar() debe ir despues de que muestre
     * el mensaje de error en el codigo principal
     * @return retorna verdadero si todas las validaciones son verdaderas, y falso si existe una validacion falsa
     */
    public static boolean verificaciones(){
        if(validaciones.contains(false)){
            return false;
        }else{
            return true;
        }
    } 
    
    
    /**
     * permite limpiar la lista de validaciones
     */
    public static void limpiar(){
        validaciones.removeAll(validaciones);
    }
}
