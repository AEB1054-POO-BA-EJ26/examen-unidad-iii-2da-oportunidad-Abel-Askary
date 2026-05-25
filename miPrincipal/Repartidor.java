package miPrincipal;
public class Repartidor extends Empleado{
    private int paquetesEntregados;
    private double aumentarSalario;

    public Repartidor(String nombre, int id,double salarioBase,int paquetesEntregados){
        super(nombre, id, salarioBase);
        this.paquetesEntregados=paquetesEntregados;
        this.aumentarSalario=aumentarSalario;
    }

    public double getAumentarSalario() {
    return aumentarSalario;
    }

    public void setAumentarSalario(double aumentarSalario) {
    this.aumentarSalario = aumentarSalario;
    }

    public int getPaquetesEntregados() {
        return paquetesEntregados;
    }

    public void setPaquetesEntregados(int paquetesEntregados) {
        this.paquetesEntregados = paquetesEntregados;
    }

    @Override
    public double calcularPago() {
        
        return aumentarSalario*paquetesEntregados+getSalarioBase();
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos();
    }

    @Override
    public void aumentarSalario(double monto) {
    
        super.aumentarSalario(monto);
    }

    @Override
    public boolean cerrarRegristo(boolean regristoCerrado) {
        // TODO Auto-generated method stub
        return super.cerrarRegristo(regristoCerrado);
    }

    

}