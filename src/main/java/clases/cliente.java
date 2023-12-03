package clases;

import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class cliente {

    private int idCliente;
    private String cuit;
    private String razonSocial;
    private String emailCliente;
    private String modificacion;
    private boolean estado;

    public cliente(int idCliente, String cuit, String razonSocial, String emailCliente, String modificacion, boolean estado){
        this.idCliente = idCliente;
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.emailCliente = emailCliente;
        this.modificacion = modificacion;
        this.estado = estado;
    }
}
