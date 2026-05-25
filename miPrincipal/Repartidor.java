package miPrincipal;
public class Repartidor extends Empleado{
    private static final double PAGO_POR_PAQUETE = 5.0;
    private int paquetesEntregados;

    public Repartidor(String nombre, int id,double salarioBase,int paquetesEntregados){
        super(nombre, id, salarioBase);
        this.paquetesEntregados=paquetesEntregados;
    }
    public int getPaquetesEntregados() {
        return paquetesEntregados;
    }

    public void setPaquetesEntregados(int paquetesEntregados) {
        this.paquetesEntregados = paquetesEntregados;
    }

    @Override
    public double calcularPago() {
        return getSalarioBase() + paquetesEntregados * PAGO_POR_PAQUETE;
    }

    @Override
    public String mostrarDatos() {
        return "Repartidor{nombre=" + getNombre() + ", id=" + getId() + ", salarioBase=" + getSalarioBase() + ", paquetesEntregados=" + paquetesEntregados + "}";
    }

    @Override
    public void aumentarSalario(double monto) {
        super.aumentarSalario(monto);
    }


    

    
        

}