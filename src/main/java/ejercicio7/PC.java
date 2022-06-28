package ejercicio7;

public class Laptop implements IComputadora{

    private String marca;
    private String modelo;
    private String procesador;
    private String sistemaOperativo;

    private String size;

    public Laptop(String marca, String modelo, String procesador, String sistemaOperativo, String size) {
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.sistemaOperativo = sistemaOperativo;
        this.size = size;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void recibirReparacion(IServicioTecnico servicioTecnico) {



    }
}
