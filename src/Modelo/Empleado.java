package Modelo;

public class Empleado {
    private int codigo;
    private String rut;
    private String nombre;
    private String apellido;
    private int celular;
    private String email;
    private int sueldoBruto;
    private String estCivil;
    private String nomDepto;

    public Empleado() {
    }

    public Empleado(int codigo, String rut, String nombre, String apellido, int celular, String email, int sueldoBruto, String estCivil, String nomDepto) {
        this.codigo = codigo;
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.email = email;
        this.sueldoBruto = sueldoBruto;
        this.estCivil = estCivil;
        this.nomDepto = nomDepto;
    }
    
    
    
    public Object[] toObjects(){
        Object[] objetos = new Object[]{codigo,rut,nombre,apellido,celular,email,sueldoBruto,estCivil,nomDepto};
        return objetos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(int sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public String getEstCivil() {
        return estCivil;
    }

    public void setEstCivil(String estCivil) {
        this.estCivil = estCivil;
    }

    public String getNomDepto() {
        return nomDepto;
    }

    public void setNomDepto(String nomDepto) {
        this.nomDepto = nomDepto;
    }
    
    
    
    
    
}
