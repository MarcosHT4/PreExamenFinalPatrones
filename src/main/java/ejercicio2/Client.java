package ejercicio2;

public class Client {

    public static void main(String[] args) {

        IEmpresa empresa = new Empresa("Dalas Inc", new InstalacionAgua(200, 54, true)
        ,new PagoPorEfectivo());

        empresa.realizarInstalacion();
        empresa.consultarFormaDePago();

        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");

        empresa.setInstalacion(new InstalacionElectrica(400, 23, false));
        empresa.setPago(new PagoPorTransferencia());

        empresa.realizarInstalacion();
        empresa.consultarFormaDePago();

        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");

        empresa.setInstalacion(new InstalacionAlcantarillado(600, 32, false));
        empresa.setPago(new PagoPorTigoMoney());

        empresa.realizarInstalacion();
        empresa.consultarFormaDePago();

        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");

        empresa.setInstalacion(new InstalacionAgua(100, 66, true));
        empresa.setPago(new PagoPorAplicacion());

        empresa.realizarInstalacion();
        empresa.consultarFormaDePago();


    }

}
