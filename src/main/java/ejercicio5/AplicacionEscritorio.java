package ejercicio5;

public class AplicacionEscritorio implements IAplicacionesWebYEscritorio {

    private String name;
    private double release;
    private boolean tieneSesion;

    public AplicacionEscritorio(String name, double release) {
        this.name = name;
        this.release = release;
        tieneSesion = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRelease() {
        return release;
    }

    public void setRelease(double release) {
        this.release = release;
    }

    public boolean isTieneSesion() {
        return tieneSesion;
    }

    public void setTieneSesion(boolean tieneSesion) {
        this.tieneSesion = tieneSesion;
    }


    @Override
    public void iniciarSesion() {

        if(tieneSesion) {

            System.out.println("Usted ya tiene sesion!");

        } else {

            System.out.println("Realizando sesion en la aplicación Escritorio: " + name);
            tieneSesion = true;

        }


    }

    @Override
    public void cerrarSesion() {

        if(tieneSesion) {

            System.out.println("Cerrando sesion en la aplicación Escritorio: " + name);
            tieneSesion = false;



        } else {

            System.out.println("Usted no tiene tiene sesion!");

        }



    }

    @Override
    public void generacionDatos() throws InterruptedException {

        System.out.println("Generando datos...");
        Thread.sleep(1000);
        System.out.println("Datos generados en la carpeta Desktop!");

    }
}
