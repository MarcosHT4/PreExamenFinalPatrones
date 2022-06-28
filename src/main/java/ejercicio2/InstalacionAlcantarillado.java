package ejercicio2;

public class InstalacionAlcantarillado implements Instalacion {

    private int precio;
    private int duracionEnDias;
    private boolean esCompleta;

    public InstalacionAlcantarillado(int precio, int duracionEnDias, boolean esCompleta) {
        this.precio = precio;
        this.duracionEnDias = duracionEnDias;
        this.esCompleta = esCompleta;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getDuracionEnDias() {
        return duracionEnDias;
    }

    public void setDuracionEnDias(int duracionEnDias) {
        this.duracionEnDias = duracionEnDias;
    }

    public boolean isEsCompleta() {
        return esCompleta;
    }

    public void setEsCompleta(boolean esCompleta) {
        this.esCompleta = esCompleta;
    }

    @Override
    public void realizarInstalacion() {

        System.out.println("Instalación de alcantarillado realizada con éxito!");

    }
}
