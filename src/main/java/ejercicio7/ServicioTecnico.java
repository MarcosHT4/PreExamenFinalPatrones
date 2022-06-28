package ejercicio7;

public class ServicioTecnico implements IServicioTecnico {


    @Override
    public void repararComputadora(Laptop laptop) {

        System.out.println("Bienvenido al sistema de reparacion para Laptops!");
        System.out.println("Usaré un destornillador y unos alicates");
        int costo = 0;

        switch (laptop.getSize()) {

            case SMALL:
                costo = 10;
                break;
            case MEDIUM:
                costo = 20;
                break;
            case BIG:
                costo = 30;
                break;

        }

        System.out.println("El costo final de la reparación es de: " + costo);
        if(laptop.getOwner().getDineroTotal() >= costo) {

            System.out.println("Por favor, abone a nuestra cuenta unica:");
            laptop.getOwner().setDineroTotal(laptop.getOwner().getDineroTotal() - costo);
            Cuenta.getInstance().pagar(costo, "Reparacion de Laptop de marca: " + laptop.getMarca());

        } else {

            System.out.println("No tiene el dinero suficiente! Procederé a destruir su laptop");

        }

    }

    @Override
    public void repararComputadora(PC pc) {

        System.out.println("Bienvenido al sistema de reparacion para PCs!");
        System.out.println("Usaré una linterna y un taladro");
        int costo = 0;

        switch (pc.getSize()) {

            case SMALL:
                costo = 50;
                break;
            case MEDIUM:
                costo = 60;
                break;
            case BIG:
                costo = 70;
                break;

        }

        System.out.println("El costo final de la reparación es de: " + costo);
        if(pc.getOwner().getDineroTotal() >= costo) {

            System.out.println("Por favor, abone a nuestra cuenta unica:");
            pc.getOwner().setDineroTotal(pc.getOwner().getDineroTotal() - costo);
            Cuenta.getInstance().pagar(costo, "Reparacion de PC de marca: " + pc.getMarca());


        } else {

            System.out.println("No tiene el dinero suficiente! Procederé a destruir su PC");

        }


    }

    @Override
    public void repararComputadora(Tablet tablet) {

        System.out.println("Bienvenido al sistema de reparacion para tablets!");
        System.out.println("Usaré un mini-destornillador y una lupa!");
        int costo = 0;

        switch (tablet.getSize()) {

            case SMALL:
                costo = 5;
                break;
            case MEDIUM:
                costo = 10;
                break;
            case BIG:
                costo = 50;
                break;

        }

        System.out.println("El costo final de la reparación es de: " + costo);
        if(tablet.getOwner().getDineroTotal() >= costo) {

            System.out.println("Por favor, abone a nuestra cuenta unica:");
            tablet.getOwner().setDineroTotal(tablet.getOwner().getDineroTotal() - costo);
            Cuenta.getInstance().pagar(costo, "Reparacion de Laptop de marca: " + tablet.getMarca());

        } else {

            System.out.println("No tiene el dinero suficiente! Procederé a destruir su tablet");

        }

    }
}
