package ejercicio7;

public class Presidente implements IEmpresario{

    private String nombre;
    private String cargo = "Presidente";

    public Presidente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(String msg) {

        System.out.println("Nuevo mensaje para el "+ cargo + ": " + nombre+": \n" + msg);

    }
}
