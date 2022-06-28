package ejercicio1;

public class MejoraEscudo extends MejoraHabilidad {



    public MejoraEscudo(Personaje personajeBase) {
        super(personajeBase);

    }



    @Override
    public void mejoraDeHabilidades() {

        System.out.println("Aplicando la mejora de escudo!");

        setPuntosDefensa(getPuntosDefensa() + getPuntosDefensa()*35);
        setPorcentajeDeArmadura(getPuntosAtaque() + getPorcentajeDeArmadura()*10);
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


