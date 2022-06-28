package ejercicio7;

public class Client {

    public static void main(String[] args) throws InterruptedException {


        Laptop laptop = new Laptop("Acer", "Nitro5", "i7", "Windows", TiposDeSize.MEDIUM,
                new Persona("Dalas", "53535", 100));

        PC pc = new PC("Asus", "RM475", "i9", "Windows", new Persona("Javi", "35463", 200),
                TiposDeSize.BIG);

        Tablet tablet = new Tablet("Samsung", "Tab7", "Snapdragon850", "Android",TiposDeSize.SMALL
                ,new Persona("Javi", "35463", 200));

        Presidente presidente = new Presidente("Manuel");
        VicePresidente vicePresidente = new VicePresidente("Paco");
        Contabilidad contabilidad = new Contabilidad("Nauter");

        Cuenta.getInstance().attach(presidente);
        Cuenta.getInstance().attach(vicePresidente);
        Cuenta.getInstance().attach(contabilidad);


        ServicioTecnico servicioTecnico = new ServicioTecnico();

        Thread pc1 = new Thread(new Runnable() {
            @Override
            public void run() {

                laptop.recibirReparacion(servicioTecnico);


            }
        });

        Thread pc2 = new Thread(new Runnable() {
            @Override
            public void run() {

                pc.recibirReparacion(servicioTecnico);


            }
        });

        Thread pc3 = new Thread(new Runnable() {
            @Override
            public void run() {

                tablet.recibirReparacion(servicioTecnico);


            }
        });

        pc1.start();
        Thread.sleep(5000);
        pc2.start();
        Thread.sleep(5000);
        pc3.start();
        Thread.sleep(5000);



        Cuenta.getInstance().mostrarMonto();










    }

}