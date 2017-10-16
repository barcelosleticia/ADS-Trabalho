
package supermercado;

public class ProdutoIncoerente implements Estado{
    
    public void estoque() {
        System.out.println("Produto faltoso no estoque!");
    }

    public void validade() {
        System.out.println("Produto vencido!");
    }  
}