package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.Calendar;

public class operador {
    @Getter
    @Setter
    private  int idOperador;
    @Getter @Setter
    private Calendar tiempoEstimado;
    public operador( int idOperador, Calendar tiempoEstimado){
        this.idOperador =idOperador;
        this.tiempoEstimado = tiempoEstimado;
    }
}
