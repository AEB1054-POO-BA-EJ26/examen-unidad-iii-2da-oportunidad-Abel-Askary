package miPrincipal;
public class Empleado{
    private String nombre;
    private int id;
    private double salarioBase;
    private boolean regristoCerrado;

    public Empleado(String nombre, int id, double salarioBase){
        this.nombre=nombre;
        this.id=id;
        this.salarioBase=salarioBase;
    }

    //get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public boolean isRegristoCerrado() {
        return regristoCerrado;
    }

    public void setRegristoCerrado(boolean regristoCerrado) {
        this.regristoCerrado = regristoCerrado;
    }

    public void cerrarRegistro() {
        this.regristoCerrado = true;
    }

    public boolean estaRegistroCerrado() {
        return regristoCerrado;
    }

    public String mostrarDatos(){
        return "Empleado{nombre=" + nombre + ", id=" + id + ", salarioBase=" + salarioBase + "}";
    }

    public double calcularPago(){
        return salarioBase;
    }
    
    public void aumentarSalario(double monto){
        this.salarioBase += monto;
    }

    public boolean assertFalse(){
        return regristoCerrado;
    }
}