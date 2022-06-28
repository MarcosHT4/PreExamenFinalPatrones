package ejercicio2;

public class Empresa implements IEmpresa {

    private String nombre;
    private Instalacion instalacion;
    private IPago pago;

    public Empresa(String nombre, Instalacion instalacion, IPago pago) {
        this.nombre = nombre;
        this.instalacion = instalacion;
        this.pago = pago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Instalacion getInstalacion() {
        return instalacion;
    }

    public void setInstalacion(Instalacion instalacion) {
        this.instalacion = instalacion;
    }

    public IPago getPago() {
        return pago;
    }

    public void setPago(IPago pago) {
        this.pago = pago;
    }

    @Override
    public void realizarInstalacion() {

        System.out.println("Realizando instalación:...");
        instalacion.realizarInstalacion();

    }

    @Override
    public void consultarFormaDePago() {

        System.out.println("Consultando la forma de pago de la instalación realizada...");
        pago.consultarFormaDePago(instalacion);

    }
}
