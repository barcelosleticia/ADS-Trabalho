package supermercado;

import supermercado.Notificar;
import java.util.ArrayList;
import java.util.List;


public class Marketing {
    private String marketing;
    private List<Notificar> observadores = new ArrayList<>();
        
        public void setMarketing (String marketing){
            this.marketing= marketing;
            for(Notificar observador: observadores){
            observador.notificar();
            }
           }
        
        public void addObservador (Notificar observador){
        this.observadores.add(observador);
        }     
}
