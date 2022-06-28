package ejercicio6;

public class Celular implements IArtefactoElectronico{

    private String marca;
    private String modelo;
    private double version;
    private String sistemaOperativo;
    private boolean tieneBluetooth;

    public Celular(String marca, String modelo, double version, String sistemaOperativo, boolean tieneBluetooth) {
        this.marca = marca;
        this.modelo = modelo;
        this.version = version;
        this.sistemaOperativo = sistemaOperativo;
        this.tieneBluetooth = tieneBluetooth;
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

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public boolean isTieneBluetooth() {
        return tieneBluetooth;
    }

    public void setTieneBluetooth(boolean tieneBluetooth) {
        this.tieneBluetooth = tieneBluetooth;
    }

    @Override
    public void recibirMantenimiento(IAplicacion aplicacion) {

        aplicacion.recomendarMantenimiento(this);

    }
}
