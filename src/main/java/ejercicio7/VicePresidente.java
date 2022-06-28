package ejercicio7;

public class VicePresidente implements IEmpresario{

    private String nombre;
    private String cargo = "VicePresidente";

    public VicePresidente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(String msg) {

        System.out.println("Nuevo mensaje para el "+ cargo + ": " + nombre+": \n" + msg);

    }
}
