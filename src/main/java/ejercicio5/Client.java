package ejercicio5;

public class Client {

    public static void main(String[] args) throws InterruptedException {



        IAplicacionesWebYEscritorio aplicacionWeb = new AplicacionWeb("React Web App", 6.3);
        IAplicacionesWebYEscritorio aplicacionEscritorio= new AplicacionEscritorio("Slack", 2.3);
        IAplicacionesWebYEscritorio aplicacionAndroid = new AdapterAplicacionesMoviles(new AplicacionAndroid("Dalas Music", 4.2));
        IAplicacionesWebYEscritorio aplicacionIOS = new AdapterAplicacionesMoviles(new AplicacionIOS("PacMan", 4.5));
        IAplicacionesWebYEscritorio aplicacionWindowsPhone = new AdapterAplicacionesMoviles(new AplicacionWindowsPhone("Instagram", 64.2));


        aplicacionWeb.iniciarSesion();
        aplicacionWeb.cerrarSesion();
        aplicacionEscritorio.iniciarSesion();
        aplicacionEscritorio.cerrarSesion();
        aplicacionEscritorio.generacionDatos();
        aplicacionAndroid.iniciarSesion();
        aplicacionAndroid.cerrarSesion();
        aplicacionAndroid.generacionDatos();
        aplicacionIOS.iniciarSesion();
        aplicacionIOS.cerrarSesion();
        aplicacionIOS.generacionDatos();
        aplicacionWindowsPhone.iniciarSesion();
        aplicacionWindowsPhone.cerrarSesion();
        aplicacionWindowsPhone.generacionDatos();




    }

}
