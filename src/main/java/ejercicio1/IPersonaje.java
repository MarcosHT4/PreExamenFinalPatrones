package ejercicio1;

import java.util.List;

public interface IPersonaje {

    void mejoraDeHabilidades();

    int getNivel();

    void setNivel(int nivel);

    List<TipoDeArma> getArmas();
    void setArmas(List<TipoDeArma> armas);
    int getPorcentajeDeArmadura();
    void setPorcentajeDeArmadura(int porcentajeDeArmadura);
    int getPuntosAtaque();
    void setPuntosAtaque(int puntosAtaque);
    int getPuntosDefensa();
    void setPuntosDefensa(int puntosDefensa);
    int getPuntosRegeneracion();
    void setPuntosRegeneracion(int puntosRegeneracion);

}
