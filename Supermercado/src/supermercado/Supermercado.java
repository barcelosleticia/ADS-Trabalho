
package supermercado;

import supermercado.Compra.Compras;
import supermercado.Compra.Embalagem;
import supermercado.processamento.Entrega;

public class Supermercado {

    public static void main(String[] args) {
        Produtos p = new Produtos();
        p.setEstado(new ProdutoNormal());
        p.estoque();
        p.validade();
        p.setEstado(new ProdutoIncoerente());
        p.estoque();
        p.validade();
        
        Produto Arroz = new Unitario("Arroz",10d);
        Produto Feijao = new Unitario("Feijao",8d);
        Produto cestabasica = new Varios (Arroz,Feijao);
        System.out.println(cestabasica.getNome()+" por " +cestabasica.getPreco());
        
        Marketing propaganda = new Marketing();
        propaganda.addObservador(new Email());
        propaganda.addObservador(new Mensagem());
        propaganda.setMarketing("Promocao!");
    
        Compras compras = new Embalagem();
        compras.setProcessador(new Entrega());
        compras.fazerCompras();
    }
}
