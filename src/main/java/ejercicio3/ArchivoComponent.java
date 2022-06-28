package ejercicio3;

public abstract class ArchivoComponent {

    private String type;
    private int numeroDePalabras;
    private String space;
    private boolean last = false;

    public ArchivoComponent(String type) {

        this.type = type;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumeroDePalabras() {
        return numeroDePalabras;
    }

    public void setNumeroDePalabras(int numeroDePalabras) {
        this.numeroDePalabras = numeroDePalabras;
    }

    public String getSpace() {
        return space;
    }

    public void setSpace(String space) {
        this.space = space;
    }

    public boolean isLast() {
        return last;
    }

    public void setLast(boolean last) {
        this.last = last;
    }

    public abstract String showInfo();
    public abstract void numberOfWords();
    public abstract void add(ArchivoComponent archivoComponent);
    public abstract void remove(ArchivoComponent archivoComponent);
    public abstract ArchivoComponent get(int index);

}
