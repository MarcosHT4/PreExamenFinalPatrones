package ejercicio6;

public class Client {

    public static void main(String[] args) {

        Celular celular = new Celular("Samsung", "Note 20",
                5.0, "Android",  true);

        Computadora computadora = new Computadora("Acer", "Nitro5", "Windows", "i9");
        Television television = new Television("AOC", "RN34", false, "HD");

        Aplicacion aplicacion = new Aplicacion();

        computadora.recibirMantenimiento(aplicacion);
        television.recibirMantenimiento(aplicacion);
        celular.recibirMantenimiento(aplicacion);

    }

}
