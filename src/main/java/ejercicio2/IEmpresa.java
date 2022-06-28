package ejercicio2;

public interface IEmpresa {

    void realizarInstalacion();
    void consultarFormaDePago();

    void setInstalacion(Instalacion instalacion);
    void setPago(IPago pago);

}
