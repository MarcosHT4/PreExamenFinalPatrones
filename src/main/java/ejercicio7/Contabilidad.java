package ejercicio7;

public class Contabilidad implements IEmpresario{

    private String nombre;
    private String cargo = "Contabilidad";

    public Contabilidad(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(String msg) {

        System.out.println("Nuevo mensaje para el "+ cargo + ": " + nombre+": \n" + msg);


    }
}
