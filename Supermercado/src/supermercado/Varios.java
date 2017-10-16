
package supermercado;

public class Varios implements Produto {
    private Produto produto1;
    private Produto produto2;
    
    public Varios (Produto produto1, Produto produto2){
        this.produto1= produto1;
        this.produto2= produto2;
    }
    
    public String getNome(){
        return produto1.getNome()+"+"+produto2.getNome();
    }
    
    public Double getPreco(){
        return produto1.getPreco()+produto2.getPreco();     
    }
    
}
