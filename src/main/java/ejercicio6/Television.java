package ejercicio6;

public class Computadora implements IArtefactoElectronico{

    private String marca;
    private String modelo;
    private String sistemaOperativo;
    private String procesador;

    public Computadora(String marca, String modelo, String sistemaOperativo, String procesador) {
        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
        this.procesador = procesador;


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


    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    @Override
    public void accept(IAplicacion aplicacion) {

    }
}
