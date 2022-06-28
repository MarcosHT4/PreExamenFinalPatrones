package ejercicio7;

public class Persona {

    private String nombre;
    private String ci;
    private int dineroTotal;

    public Persona(String nombre, String ci, int dineroTotal) {
        this.nombre = nombre;
        this.ci = ci;
        this.dineroTotal = dineroTotal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public int getDineroTotal() {
        return dineroTotal;
    }

    public void setDineroTotal(int dineroTotal) {
        this.dineroTotal = dineroTotal;
    }
}
