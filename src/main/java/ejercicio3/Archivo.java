package ejercicio3;

public class Archivo extends ArchivoComponent{



    public Archivo(String type, int numeroPalabras) {

        super(type);
        setNumeroDePalabras(numeroPalabras);
    }

    @Override
    public String showInfo() {
        return getSpace() + getType() + ": \n" + getSpace() + "-Numero de Palabras: " + getNumeroDePalabras() + "\n";
    }

    @Override
    public void numberOfWords() {

        Helper.getInstance().add(showInfo());


    }

    @Override
    public void add(ArchivoComponent archivoComponent) {

    }

    @Override
    public void remove(ArchivoComponent archivoComponent) {

    }

    @Override
    public ArchivoComponent get(int index) {
        return null;
    }
}
