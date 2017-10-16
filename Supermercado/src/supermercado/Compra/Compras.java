package supermercado.Compra;

import supermercado.processamento.Processador;

public abstract class Compras {
    private Processador processador;
    
    public void setProcessador(Processador processador){
        this.processador = processador;
    }
    
    public void fazerCompras(){
        escolherProdutos();
        calcularProdutos();
        embalagem();
        processa();
    }
    private void escolherProdutos(){
        System.out.println("Produtos escolhidos!");
    }
    private void calcularProdutos(){
        System.out.println("Produtos calculados");
    }
    protected abstract void embalagem();
    
    private void processa(){
        processador.processa();
    }   
}