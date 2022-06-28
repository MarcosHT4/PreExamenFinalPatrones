package ejercicio1;

public class MejoraPociones extends MejoraHabilidad {



    public MejoraPociones(IPersonaje personajeBase) {
        super(personajeBase);

    }



    @Override
    public void mejoraDeHabilidades() {

        super.mejoraDeHabilidades();
        System.out.println("Aplicando la mejora de pociones!");

        setPuntosRegeneracion(getPuntosRegeneracion() + getPuntosRegeneracion()*80);


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


