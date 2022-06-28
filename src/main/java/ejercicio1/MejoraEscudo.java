package ejercicio1;

public class MejoraEscudo extends MejoraHabilidad {



    public MejoraEscudo(IPersonaje personajeBase) {
        super(personajeBase);

    }



    @Override
    public void mejoraDeHabilidades() {

        super.mejoraDeHabilidades();
        System.out.println("Aplicando la mejora de escudo!");

        setPuntosDefensa(getPuntosDefensa() + getPuntosDefensa()*35);
        setPorcentajeDeArmadura(getPorcentajeDeArmadura() + getPorcentajeDeArmadura()*10);


        System.out.println("Nuevo status: ");
        System.out.println("Nivel: " + getNivel());
        System.out.print("Armas: ");

        for(TipoDeArma tipoDeArma : getArmas()) {

            System.out.print(tipoDeArma + ", ");

        }
        System.out.println();

        System.out.println("Porcentaje de Armadura: " + getPorcentajeDeArmadura());
        System.out.println("Puntos de Ataque: " + getPuntosAtaque());
        System.out.println("Puntos de Defensa: " + getPuntosDefensa());
        System.out.println("Puntos de Regeneracion de Vida: " + getPuntosRegeneracion());


    }


}


