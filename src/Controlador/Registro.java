package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *Clase que se encarga de la conexion a la base de datos y
 * la manipulacion CRUD de la BD
 * @author Pablo Montero
 * @author Cristian Montero
 * @version 1.0
 */
public class Registro {
    
    public static Registro registro = new Registro();
    
    private String url = "jdbc:oracle:thin:@localhost:1521:XE";
    private String user = "pablo";
    private String pass = "pablo";
    /**
     * Permite probar si esxiste una conexion a la base de datos
     * definidos en url,user,pass. 
     * @return retorna verdadero si puede realizar la conexion
     */
    public boolean testConexion(){
        try (Connection conexion = DriverManager.getConnection(url,user,pass)){
            System.out.println("Conectado");
            return true;
        } catch (SQLException e) {
            System.out.println("No Conectado");
            return false;
        }
    }
    
    
    //TODO: metodo agregarEmpleado(Empleado empleado) : boolean
    //TODO: metodo buscarByCodigo(String codigo) : boolean
    //TODO: metodo ListarTodo : Object[][]
    //TODO: metodo ListarByDepto(String departamento) : Object[][]
    //TODO: metodo getEmpleado(String codigo) : Empleado
    //TODO: metodo modificarEmpleado(String codigo) : boolean
    //TODO: metodo modificarTodosSueldos(String monto) : boolean
    //TODO: metodo eliminarByCodigo(String codigo) : boolean
    //TODO: metodo eliminarBySueldo(String monto) : boolean

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
    
    
    
}
