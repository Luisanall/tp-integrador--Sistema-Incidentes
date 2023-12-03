package clases;

import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class comercial {

    private int idComercial;
    private boolean estadoCliente;
    private  String modificacionClientes;
    public comercial( int idComercial, boolean estadoCliente, String modificacionClientes){
        this.idComercial = idComercial;
        this.estadoCliente = estadoCliente;
        this.modificacionClientes = modificacionClientes;
    }
}
