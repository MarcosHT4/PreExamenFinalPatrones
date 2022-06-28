package ejercicio7;

public class PC implements IComputadora{

    private String marca;
    private String modelo;
    private String procesador;
    private String sistemaOperativo;

    private Persona owner;
    private TiposDeSize size;

    public PC(String marca, String modelo, String procesador, String sistemaOperativo, Persona owner, TiposDeSize size) {
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.sistemaOperativo = sistemaOperativo;
        this.size = size;
        this.owner = owner;
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

    public Persona getOwner() {
        return owner;
    }

    public void setOwner(Persona owner) {
        this.owner = owner;
    }

    public TiposDeSize getSize() {
        return size;
    }

    public void setSize(TiposDeSize size) {
        this.size = size;
    }

    @Override
    public void recibirReparacion(IServicioTecnico servicioTecnico) {

        servicioTecnico.repararComputadora(this);

    }
}
