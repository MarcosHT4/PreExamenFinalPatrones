package ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {

    private static Cuenta instance;

    private int cantidad;
    private List<String> listaDeDetalles = new ArrayList<>();
    private List<IEmpresario> empresarios = new ArrayList<>();

    private Cuenta() {}

    private synchronized static void multiPaymentControl() {

        if(instance == null) {

            instance = new Cuenta();

        }

    }

    public static Cuenta getInstance() {

        if(instance == null) {

            multiPaymentControl();

        }

        return instance;

    }

    public void pagar(int monto, String detalleDePago) {

        cantidad +=monto;
        listaDeDetalles.add(detalleDePago);
        System.out.println("Pago realizado con exito!");
        notificarEmpresarios(detalleDePago);

    }

    public void mostrarMonto() {

        System.out.println("Monto total de la cuenta: " + cantidad);

    }

    public void attach(IEmpresario empresario) {

        empresarios.add(empresario);

    }

    public void detach(IEmpresario empresario) {

        empresarios.remove(empresario);

    }

    public void notificarEmpresarios(String detalleDePago) {

        for(IEmpresario empresario : empresarios) {

            empresario.update("Nuevo pago realizado! Detalle adjunto: \n" +detalleDePago );

        }

    }



}
