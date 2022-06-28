package ejercicio1;

import java.util.List;

public abstract class MejoraHabilidad implements IPersonaje {

    private IPersonaje personajeBase;

    public MejoraHabilidad(IPersonaje personajeBase) {

        this.personajeBase = personajeBase;

    }

    @Override
    public int getNivel() {
        return personajeBase.getNivel();
    }

    @Override
    public void setNivel(int nivel) {

        personajeBase.setNivel(nivel);

    }

    @Override
    public int getPorcentajeDeArmadura() {
        return personajeBase.getPorcentajeDeArmadura();
    }

    @Override
    public void setPorcentajeDeArmadura(int porcentajeDeArmadura) {
        personajeBase.setPorcentajeDeArmadura(porcentajeDeArmadura);
    }

    @Override
    public List<TipoDeArma> getArmas() {
        return personajeBase.getArmas();
    }

    public void setArmas(List<TipoDeArma> armas) {

        personajeBase.setArmas(armas);

    }

    @Override
    public int getPuntosAtaque() {
        return personajeBase.getPuntosAtaque();
    }

    @Override
    public void setPuntosAtaque(int puntosAtaque) {

        personajeBase.setPuntosAtaque(puntosAtaque);

    }

    @Override
    public int getPuntosDefensa() {
        return personajeBase.getPuntosDefensa();
    }

    @Override
    public void setPuntosDefensa(int puntosDefensa) {
        personajeBase.setPuntosDefensa(puntosDefensa);
    }

    @Override
    public int getPuntosRegeneracion() {
        return personajeBase.getPuntosRegeneracion();
    }

    @Override
    public void setPuntosRegeneracion(int puntosRegeneracion) {

        personajeBase.setPuntosRegeneracion(puntosRegeneracion);

    }



    public IPersonaje getPersonajeBase() {
        return personajeBase;
    }

    public void setPersonajeBase(IPersonaje personajeBase) {
        this.personajeBase = personajeBase;
    }

    @Override

    public void mejoraDeHabilidades() {

        personajeBase.mejoraDeHabilidades();

    }

}
