package Controlador;

import Modelo.Empleado;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
    
    /**
     * Permite agrergar un registro a la base de datos
     * @param empleado Esta clase toma un objeto tipo Empleado para agregar el registro
     * debe ser instanciado con el constructor que toma todos los atributos.
     * @return retorna verdadero si fue agregado a la base de datos
     */
    public boolean agregarEmpleado(Empleado empleado){
        String insert = "insert into empleados values (?,?,?,?,?,?,?,?,?)";
        
        try (
                Connection conexion = DriverManager.getConnection(url, user, pass);
                PreparedStatement ps = conexion.prepareStatement(insert)){
            
            ps.setInt(1, empleado.getCodigo());
            ps.setString(2, empleado.getRut());
            ps.setString(3, empleado.getNombre());
            ps.setString(4, empleado.getApellido());
            ps.setInt(5, empleado.getCelular());
            ps.setString(6, empleado.getEmail());
            ps.setInt(7, empleado.getSueldoBruto());
            ps.setString(8, empleado.getEstCivil());
            ps.setString(9, empleado.getNomDepto());
            ps.executeUpdate();
            System.out.println("Agregado Correctamente");
            return true;
            
        } catch (SQLException e) {
            System.out.println("Error al agregar" + e);
            return false;
        }
    }
    
    /**
     * Busca el codigo dentro de la base de datos
     * @param codigo el codigo debe estar en tipo String
     * @return retorna verdadero si lo encuentra
     */
    public boolean buscarByCodigo(String codigo){
        String select = "select * from empleados where codigo = ?";
        
        try (
                Connection conexion = DriverManager.getConnection(url,user,pass);
                PreparedStatement ps = conexion.prepareStatement(select)){
            
            ps.setString(1, codigo);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println("Encontrado");
                return true;
            }
            System.out.println("No Encontrado");
            return false;
            
        } catch (SQLException e) {
            System.out.println("Error al buscar por codigo " + e);
            return false;
        }
    }
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
