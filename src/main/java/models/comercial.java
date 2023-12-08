package clases;

import lombok.Getter;
import lombok.Setter;

public class comercial {
    @Getter
    @Setter
    private int idComercial;
    @Getter
    @Setter
    private boolean estadoCliente;
    @Getter
    @Setter
    private  String modificacionClientes;
    public comercial( int idComercial, boolean estadoCliente, String modificacionClientes){
        this.idComercial = idComercial;
        this.estadoCliente = estadoCliente;
        this.modificacionClientes = modificacionClientes;
    }
}
