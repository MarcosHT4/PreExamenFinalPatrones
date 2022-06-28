package ejercicio6;

import java.util.Random;

public class Aplicacion implements IAplicacion{


    @Override
    public void recomendarMantenimiento(Celular celular) {

        System.out.println("Bienvenido a mantemiento de celular!");
        System.out.println("Primero verifiquemos su celular");
        System.out.println("***");
        System.out.println("Celular: ");
        System.out.println("Marca: " + celular.getMarca());
        System.out.println("Modelo: " + celular.getModelo());
        System.out.println("Version: " + celular.getVersion());
        System.out.println("Sistema Operativo: " + celular.getSistemaOperativo());
        System.out.println("Tiene Bluetooth?: " + celular.isTieneBluetooth());
        System.out.println("***");
        System.out.println("Se le recomienda un mantenimiento preventivo!");
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");

    }

    @Override
    public void recomendarMantenimiento(Television television) {

        System.out.println("Bienvenido a mantenimiento de television!");
        System.out.println("Le mostraremos las caracterisiticas de su televisor: ");
        System.out.println("***");
        System.out.println("Televisor: ");
        System.out.println("Marca: " + television.getMarca());
        System.out.println("Modelo: " + television.getModelo());
        System.out.println("Tiene pantalla plana?: " + television.isTienePantallaPlana());
        System.out.println("Resolucion: " + television.getResolucion());
        System.out.println("***");
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");


    }

    @Override
    public void recomendarMantenimiento(Computadora computadora) {

        System.out.println("Bienvenido a mantenimiento de computadoras!");
        int num = new Random().nextInt(100);

        if(num % 2 ==0) {

            System.out.println("Se le recomienda un mantenimiento preventivo");

        } else {

            System.out.println("Se le recomienda un mantenimiento correctivo");

        }

        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");


    }
}
