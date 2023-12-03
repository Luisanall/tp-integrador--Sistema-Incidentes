package models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Cliente")
@Getter @Setter
public class cliente {
    @Id
    @Column (name= "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;
    @Column
    private String cuit;
    @Column
    private String razonSocial;
    @Column
    private String emailCliente;
    @Column
    private String modificacion;
    @Column
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
