package supermercado;

public class Unitario implements Produto{
    private String nome;
    private Double preco;
    
    public Unitario (String nome, Double preco){
        this.nome= nome;
        this.preco=preco;
    }

    public String getNome(){
        return this.nome;      
    }
    
    public Double getPreco(){
        return this.preco;      
    }
}
