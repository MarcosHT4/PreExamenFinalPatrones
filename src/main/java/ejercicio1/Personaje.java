package ejercicio1;


import java.util.ArrayList;
import java.util.List;

public class Personaje implements IPersonaje{

    private String nombre;
    private int nivel;
    private List<TipoDeArma> armas = new ArrayList<>();
    private int porcentajeDeArmadura;
    private int puntosAtaque;
    private int puntosDefensa;
    private int puntosRegeneracion;

    public Personaje(String nombre) {

        this.nombre = nombre;
        nivel = 1;
        porcentajeDeArmadura = 1;
        puntosAtaque = 1;
        puntosDefensa = 1;
        puntosRegeneracion = 1;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public List<TipoDeArma> getArmas() {
        return armas;
    }

    public void setArmas(List<TipoDeArma> armas) {
        this.armas = armas;
    }

    public int getPorcentajeDeArmadura() {
        return porcentajeDeArmadura;
    }

    public void setPorcentajeDeArmadura(int porcentajeDeArmadura) {
        this.porcentajeDeArmadura = porcentajeDeArmadura;
    }

    public int getPuntosAtaque() {
        return puntosAtaque;
    }

    public void setPuntosAtaque(int puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    public int getPuntosDefensa() {
        return puntosDefensa;
    }

    public void setPuntosDefensa(int puntosDefensa) {
        this.puntosDefensa = puntosDefensa;
    }

    public int getPuntosRegeneracion() {
        return puntosRegeneracion;
    }

    public void setPuntosRegeneracion(int puntosRegeneracion) {
        this.puntosRegeneracion = puntosRegeneracion;
    }

    @Override
    public void mejoraDeHabilidades() {

        System.out.println("Empezando la mejora de habilidades del personaje: " + nombre);
        System.out.println("Habilidades actuales: ");
        System.out.println("Nivel: " + nivel);
        System.out.print("Armas: ");
        for(TipoDeArma tipoDeArma : armas) {

            System.out.print(tipoDeArma + ", ");

        }
        System.out.println();

        System.out.println("Porcentaje de Armadura: " + porcentajeDeArmadura);
        System.out.println("Puntos de Ataque: " + puntosAtaque);
        System.out.println("Puntos de Defensa: " + puntosDefensa);
        System.out.println("Puntos de Regeneracion de Vida: " + puntosRegeneracion);

    }
}
