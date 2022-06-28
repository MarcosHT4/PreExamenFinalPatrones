package ejercicio1;

public class Client {

    public static void main(String[] args) {

        IPersonaje personaje = new Personaje("Dalas");

        personaje = new MejoraArma(personaje, TipoDeArma.ESCOPETA);
        personaje = new MejoraEscudo(personaje);
        personaje = new MejoraPociones(personaje);

        personaje.mejoraDeHabilidades();

    }

}
