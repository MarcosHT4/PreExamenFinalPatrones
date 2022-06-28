package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class CompositeArchivo extends ArchivoComponent {

    private List<ArchivoComponent> archivoComponentList = new ArrayList<>();

    public CompositeArchivo(String type) {
        super(type);
    }


    @Override
    public String showInfo() {
        return getSpace() + getType() + ": \n" + getSpace() + "-Numero de Palabras: " + getNumeroDePalabras() + "\n";
    }

    @Override
    public void numberOfWords() {

        for(ArchivoComponent archivoComponent : archivoComponentList) {

            archivoComponent.numberOfWords();
            this.setNumeroDePalabras(this.getNumeroDePalabras() + archivoComponent.getNumeroDePalabras());

        }

        Helper.getInstance().add(showInfo());

        if(isLast()) {

            Helper.getInstance().showInfo();

        }


    }

    @Override
    public void add(ArchivoComponent archivoComponent) {

        archivoComponentList.add(archivoComponent);
    }

    @Override
    public void remove(ArchivoComponent archivoComponent) {

        archivoComponentList.remove(archivoComponent);
    }

    @Override
    public ArchivoComponent get(int index) {
        return archivoComponentList.get(index);
    }
}
