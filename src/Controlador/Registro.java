package Controlador;

import Modelo.Empleado;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
    /**
     * busca toda la informacion en la base de datos para poder trabajar el modelo
     * de una jTable
     * @return retorna un Object[][] para ingresar los datos a una jTable mediante setDataModel
     */
    public Object[][] listarTodo(){
        Object[][] listaEmpleados = null;
        List<Empleado> tempEmpleado = new ArrayList<>();
        List<Object[]> tempObject = new ArrayList<>();
        String select = "select * from empleados";
        try (
                Connection conexion = DriverManager.getConnection(url, user, pass);
                Statement ps = conexion.createStatement()){
            
            ResultSet rs = ps.executeQuery(select);
            while(rs.next()){
                Empleado empleado = new Empleado();
                empleado.setCodigo(rs.getInt("codigo"));
                empleado.setRut(rs.getString("rut"));
                empleado.setNombre(rs.getString("nombre"));
                empleado.setApellido(rs.getString("apellido"));
                empleado.setCelular(rs.getInt("celular"));
                empleado.setEmail(rs.getString("email"));
                empleado.setSueldoBruto(rs.getInt("sueldo_bruto"));
                empleado.setEstCivil(rs.getString("est_civil"));
                empleado.setNomDepto(rs.getString("nom_depto"));
                tempEmpleado.add(empleado);
            }
            
            tempEmpleado.forEach(e -> tempObject.add(e.toObjects()));
            listaEmpleados = new Object[tempEmpleado.size()][1];
            listaEmpleados = tempObject.toArray(listaEmpleados);
            System.out.println("Listar con exito "+ listaEmpleados.toString());
            return listaEmpleados;
        } catch (SQLException e) {
            System.out.println("Error en listarTodo " + e);
            return null;
        }
    }
    /**
     * busca toda la informacion en la base de datos para poder trabajar el
     * modelo de una jTable donde coincida el nombre del departamento
     *
     * @return retorna un Object[][] para ingresar los datos a una jTable
     * mediante setDataModel
     */
    public Object[][] listarByDepto(String departamento) {
        Object[][] listaEmpleados = null;
        List<Empleado> tempEmpleado = new ArrayList<>();
        List<Object[]> tempObject = new ArrayList<>();
        String select = "select * from empleados where nom_depto = '"+departamento+"'";
        try (
                Connection conexion = DriverManager.getConnection(url, user, pass);
                Statement ps = conexion.createStatement()) {

            ResultSet rs = ps.executeQuery(select);
            while (rs.next()) {
                Empleado empleado = new Empleado();
                empleado.setCodigo(rs.getInt("codigo"));
                empleado.setRut(rs.getString("rut"));
                empleado.setNombre(rs.getString("nombre"));
                empleado.setApellido(rs.getString("apellido"));
                empleado.setCelular(rs.getInt("celular"));
                empleado.setEmail(rs.getString("email"));
                empleado.setSueldoBruto(rs.getInt("sueldo_bruto"));
                empleado.setEstCivil(rs.getString("est_civil"));
                empleado.setNomDepto(rs.getString("nom_depto"));
                tempEmpleado.add(empleado);
            }

            tempEmpleado.forEach(e -> tempObject.add(e.toObjects()));
            listaEmpleados = new Object[tempEmpleado.size()][1];
            listaEmpleados = tempObject.toArray(listaEmpleados);
            System.out.println("Listar con exito " + listaEmpleados.toString());
            return listaEmpleados;
        } catch (SQLException e) {
            System.out.println("Error en listarTodo " + e);
            return null;
        }
    }
    public Object[][] listarByCodigo(String cod) {
        Object[][] listaEmpleados = null;
        List<Empleado> tempEmpleado = new ArrayList<>();
        List<Object[]> tempObject = new ArrayList<>();
        String select = "select * from empleados where codigo = '"+cod+"'";
        try (
                Connection conexion = DriverManager.getConnection(url, user, pass);
                Statement ps = conexion.createStatement()) {

            ResultSet rs = ps.executeQuery(select);
            while (rs.next()) {
                Empleado empleado = new Empleado();
                empleado.setCodigo(rs.getInt("codigo"));
                empleado.setRut(rs.getString("rut"));
                empleado.setNombre(rs.getString("nombre"));
                empleado.setApellido(rs.getString("apellido"));
                empleado.setCelular(rs.getInt("celular"));
                empleado.setEmail(rs.getString("email"));
                empleado.setSueldoBruto(rs.getInt("sueldo_bruto"));
                empleado.setEstCivil(rs.getString("est_civil"));
                empleado.setNomDepto(rs.getString("nom_depto"));
                tempEmpleado.add(empleado);
            }

            tempEmpleado.forEach(e -> tempObject.add(e.toObjects()));
            listaEmpleados = new Object[tempEmpleado.size()][1];
            listaEmpleados = tempObject.toArray(listaEmpleados);
            System.out.println("Listar con exito " + listaEmpleados.toString());
            return listaEmpleados;
        } catch (SQLException e) {
            System.out.println("Error en listarTodo " + e);
            return null;
        }
    }
    /**
     * permite obtener la informacion de un registro de la base de datos
     * en una instancia de Empleado
     * @param codigo codigo del registro a obtener
     * @return retorna la instancia de Empleado
     */
    public Empleado getEmpleado(String codigo){
        String select = "select * from empleados where codigo = "+codigo;
        Empleado empleado = new Empleado();
        try(
                Connection conexion = DriverManager.getConnection(url, user, pass);
                Statement ps = conexion.createStatement()) {
            ResultSet rs = ps.executeQuery(select);
            if(rs.next()) {
                empleado.setCodigo(rs.getInt("codigo"));
                empleado.setRut(rs.getString("rut"));
                empleado.setNombre(rs.getString("nombre"));
                empleado.setApellido(rs.getString("apellido"));
                empleado.setCelular(rs.getInt("celular"));
                empleado.setEmail(rs.getString("email"));
                empleado.setSueldoBruto(rs.getInt("sueldo_bruto"));
                empleado.setEstCivil(rs.getString("est_civil"));
                empleado.setNomDepto(rs.getString("nom_depto"));
                System.out.println("Empleado encontrado " + empleado.toString());
                return empleado;
            }else{
                System.out.println("Empleado No encontrado ");
                return null;
            }
        } catch (SQLException e) {
            System.out.println("Error en getEmpleado "+ e);
            return null;
        }
    }
    /**
     * permite la modificacion de los valores de un registro
     * @param empleado instacia de empleado con los valores actualizados
     * @param codigo codigo del registro a modificar
     * @return retorna verdadero si se logra modificar el registro
     */
    public boolean modificarEmpleado(Empleado empleado, String codigo) {
        String insert = "update empleados set codigo = ?, rut = ?, nombre = ?, "+
                "apellido = ?, celular = ?, email = ?, sueldo_bruto = ?, "+
                "est_civil = ?, nom_depto = ? where codigo = "+codigo;

        try (
                Connection conexion = DriverManager.getConnection(url, user, pass);
                PreparedStatement ps = conexion.prepareStatement(insert)) {

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
            System.out.println("Modificado Correctamente");
            return true;

        } catch (SQLException e) {
            System.out.println("Error en modificarEmpleado" + e);
            return false;
        }
    }
    /**
     * Permite realizar ajustes porcetuales a todos los registros de la bse de datos
     * @param porcentaje es numero entero ingresado como String
     * @return 
     */
    public boolean modificarTodosSueldos(String porcentaje) {
        try (
                Connection conexion = DriverManager.getConnection(url, user, pass);
                Statement ps = conexion.createStatement()) {
            
            

            String update = "update empleados set sueldo_bruto = sueldo_bruto * "+(1+Double.parseDouble(porcentaje)/100);
            
            ps.executeUpdate(update);
            System.out.println("Modificados Correctamente");
            return true;

        } catch (SQLException e) {
            System.out.println("Error en modificarTodosSueldos" + e);
            return false;
        }
    }
    /**
     * elimina registro mediante el codigo
     * @param codigo el codigo debe estar en forma de String
     * @return retorna verdadero si encuentra y borra con exito el registro
     */
    public boolean eliminarByCodigo(String codigo){
        try (
                Connection conexion = DriverManager.getConnection(url, user, pass);
                Statement ps = conexion.createStatement()) {

            String update = "delete from empleados where codigo = " + codigo;
            if(buscarByCodigo(codigo)){
                ps.executeUpdate(update);
                System.out.println("Eliminado Correctamente");
                return true;
            }else{
                return false;
            }

        } catch (SQLException e) {
            System.out.println("Error en eliminarByCodigo" + e);
            return false;
        }
    }
    /**
     * Permite eliminar registro de la bae de datos los cuales tengan el monto
     * pasado como parametro
     * @param monto monto a buscar en los resgistro para eliminar debe ser ingresado como String
     * @return  retorna verdadero si encontro y borro registros
     */
    public boolean eliminarBySueldo(String monto) {
        try (
                Connection conexion = DriverManager.getConnection(url, user, pass);
                Statement ps = conexion.createStatement()) {
            String query = "select * from empleados where sueldo_bruto = " + monto;   
            String update = "delete from empleados where sueldo_bruto = " + monto;
            ResultSet rs = ps.executeQuery(query);
            if(rs.next()){
                ps.executeUpdate(update);
                System.out.println("Eliminados Correctamente");
                return true;
            }else{
                System.out.println("No Encontrados");
                return false;
            }

        } catch (SQLException e) {
            System.out.println("Error en eliminarByCodigo" + e);
            return false;
        }
    }

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
