package ejercicio2;

public class PagoPorEfectivo implements IPago{
    @Override
    public void consultarFormaDePago(Instalacion instalacion) {

        System.out.println("El precio de la instalación es de: " + instalacion.getPrecio() + " Bs.");
        System.out.println("No hay descuento!");

    }
}
