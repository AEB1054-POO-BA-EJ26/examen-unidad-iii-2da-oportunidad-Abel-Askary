package miPrincipal;

public class Supervisor extends Empleado{
    private double bonoFijo;

    public Supervisor(String nombre, int id,double salarioBase, double bonoFijo){
        super(nombre, id, salarioBase);
        this.bonoFijo=bonoFijo;
    }

    public double getBonoFijo() {
        return bonoFijo;
    }

    public void setBonoFijo(double bonoFijo) {
        this.bonoFijo = bonoFijo;
    }

    @Override
    public double calcularPago(){
        return bonoFijo+getSalarioBase();
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos();
    }
    

}