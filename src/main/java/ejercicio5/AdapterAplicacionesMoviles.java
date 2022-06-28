package ejercicio5;

public class AdapterAplicacionesMoviles implements IAplicacionesWebYEscritorio{

    private IAplicacionesMoviles aplicacionAdaptada;

    public AdapterAplicacionesMoviles(IAplicacionesMoviles aplicacionAdaptada) {

        this.aplicacionAdaptada = aplicacionAdaptada;

    }

    @Override
    public void iniciarSesion() {

        aplicacionAdaptada.login();

    }

    @Override
    public void cerrarSesion() {

        aplicacionAdaptada.logout();
    }

    @Override
    public void generacionDatos() throws InterruptedException {

        aplicacionAdaptada.reportes();

    }
}
