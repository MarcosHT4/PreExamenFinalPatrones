package ejercicio3;

public class Client {

    public static void main(String[] args) {

        Archivo archivo1 = new Archivo("Archivo", 500);
        Archivo archivo2 = new Archivo("Archivo", 4300);
        Archivo archivo3 = new Archivo("Archivo", 1000);
        Archivo archivo4 = new Archivo("Archivo", 2500);

        archivo1.setSpace("\t\t\t\t");
        archivo2.setSpace("\t\t\t\t");
        archivo3.setSpace("\t\t\t\t");
        archivo4.setSpace("\t\t\t\t");


        CompositeArchivo folder1 = new CompositeArchivo("Folder");
        CompositeArchivo folder2 = new CompositeArchivo("Folder");

        folder1.add(archivo1);
        folder1.add(archivo2);
        folder2.add(archivo3);
        folder2.add(archivo4);

        folder1.setSpace("\t\t");
        folder2.setSpace("\t\t");

        CompositeArchivo unidadDisco = new CompositeArchivo("Unidad De Disco");
        unidadDisco.add(folder1);
        unidadDisco.add(folder2);
        unidadDisco.setLast(true);
        unidadDisco.setSpace("");

        unidadDisco.numberOfWords();





    }

}
