package models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name= "COMERCIAL")
@Getter @Setter
public class comercial {
    @Id
    @Column(name= "id_COMERCIAL")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComercial;
    @Column
    private boolean estadoCliente;
    @Column
    private  String modificacionClientes;
    public comercial( int idComercial, boolean estadoCliente, String modificacionClientes){
        this.idComercial = idComercial;
        this.estadoCliente = estadoCliente;
        this.modificacionClientes = modificacionClientes;
    }
}
