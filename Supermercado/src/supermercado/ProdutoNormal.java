
package supermercado;

public class ProdutoNormal implements Estado{
    
    public void estoque() {
        System.out.println("Temos o produto em estoque!");
    }

    public void validade() {
        System.out.println("Este produto está dentro do prazo de validade!");
    }  
}
