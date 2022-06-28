package ejercicio2;

public class PagoPorTigoMoney implements IPago{
    @Override
    public void consultarFormaDePago(Instalacion instalacion) {

        System.out.println("El precio de la instalación es de: " + instalacion.getPrecio() + " Bs.");
        System.out.println("Hay un descuento del 2%!");
        instalacion.setPrecio(instalacion.getPrecio() - instalacion.getPrecio()*2/100);
        System.out.println("El nuevo precio es de: " + instalacion.getPrecio() + " Bs.");


    }
}
