package supermercado;

public class Produtos {
    private Estado estado;
    public Produtos() {
        this.estado = new ProdutoNormal();
        this.estado = new ProdutoIncoerente();
    }
    
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    public void estoque(){
        estado.estoque();
    }
    public void validade(){
        estado.validade();
    }
}