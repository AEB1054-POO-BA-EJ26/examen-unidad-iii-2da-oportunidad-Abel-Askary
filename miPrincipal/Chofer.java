package miPrincipal;

public class Chofer extends Empleado {
    private double kilometrosRecorridos;

    public Chofer (String nombre,int id,double salarioBase,double kilometrosRecorridos){
        super(nombre,id,salarioBase);
        this.kilometrosRecorridos=kilometrosRecorridos;
    }

    public double getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(double kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    
    
    
}
