/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Empleado;

/**
 *
 * @author Pablo
 */
public class Main {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VentanaPrincipal.getInstance();
        Registro.registro.testConexion();
        //Empleado empleado = new Empleado(100, "163591340", "pablo", "montero", 62057863, "pablo@gmail.com", 1200000, "c", "Diseño");
        //Registro.registro.agregarEmpleado(empleado);
        Registro.registro.buscarByCodigo("101");
    }
    
}
