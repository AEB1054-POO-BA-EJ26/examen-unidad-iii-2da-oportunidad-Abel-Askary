package miPrincipal;
public class Auxiliar extends Empleado{
    private int horasExtra;
    public Auxiliar (String nombre, int id,double salarioBase,int horasExtra){
        super(nombre, id, salarioBase);
        this.horasExtra=horasExtra;

    }
    public int getHorasExtra() {
        return horasExtra;
    }
    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }
    @Override
    public double calcularPago() {
        
        return super.calcularPago();
    }
    @Override
    public String mostrarDatos() {
        
        return super.mostrarDatos();
    }
    
    
}