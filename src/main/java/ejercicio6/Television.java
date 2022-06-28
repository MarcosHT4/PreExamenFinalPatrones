package ejercicio6;

public class Television implements IArtefactoElectronico{




    private String marca;
    private String modelo;

    private boolean tienePantallaPlana;

    private String resolucion;

    public Television(String marca, String modelo, boolean tienePantallaPlana, String resolucion) {
        this.marca = marca;
        this.modelo = modelo;
        this.tienePantallaPlana = tienePantallaPlana;
        this.resolucion = resolucion;
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

    public boolean isTienePantallaPlana() {
        return tienePantallaPlana;
    }

    public void setTienePantallaPlana(boolean tienePantallaPlana) {
        this.tienePantallaPlana = tienePantallaPlana;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }



    @Override
    public void recibirMantenimiento(IAplicacion aplicacion) {

    aplicacion.recomendarMantenimiento(this);

    }
}
