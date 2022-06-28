package ejercicio1;

public class MejoraArma extends MejoraHabilidad {


    private TipoDeArma armaNueva;

    public MejoraArma(Personaje personajeBase, TipoDeArma armaNueva) {
        super(personajeBase);
        this.armaNueva = armaNueva;

    }

    public TipoDeArma getArmaNueva() {
        return armaNueva;
    }

    public void setArmaNueva(TipoDeArma armaNueva) {
        this.armaNueva = armaNueva;
    }

    @Override
    public void mejoraDeHabilidades() {

        System.out.println("Aplicando la mejora de nueva arma!");
        getArmas().add(armaNueva);
        setPuntosAtaque(getPuntosDefensa()*30/100);
        setNivel(getNivel()*2);

        System.out.println("Nuevo status: ");
        System.out.println("Nivel: " + getNivel());
        for(TipoDeArma tipoDeArma : getArmas()) {

            System.out.print(tipoDeArma + ", ");

        }

        System.out.println("Porcentaje de Armadura: " + getPorcentajeDeArmadura());
        System.out.println("Puntos de Ataque: " + getPuntosAtaque());
        System.out.println("Puntos de Defensa: " + getPuntosDefensa());
        System.out.println("Puntos de Regeneracion de Vida: " + getPuntosRegeneracion());

    }


}


