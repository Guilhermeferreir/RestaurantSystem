package Produtos;


public class Prato_Bebida {
    
    private String nome;
    private double preco;
    
    public Prato_Bebida(){
        
    }
    
    public Prato_Bebida(String nome, double preco ){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
   

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Prato_Bebida{" + "nome=" + nome + ", preco=" + preco + '}';
    }

    
    
    
    
}
