package clases;

import lombok.Getter;
import lombok.Setter;

public class cliente {
    @Getter
    @Setter
    private int idCliente;
    @Getter @Setter
    private String cuit;
    @Getter @Setter
    private String razonSocial;
    @Getter @Setter
    private String emailCliente;
    @Getter @Setter
    private String modificacion;
    @Getter @Setter
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
