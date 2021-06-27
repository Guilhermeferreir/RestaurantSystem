package Produtos;

import java.util.ArrayList;
import java.util.Scanner;


public class Pedido {
    
    private String nomeCliente;
    private ArrayList<Prato_Bebida> itensConsumidos;
    
    public Pedido() {
        itensConsumidos = new ArrayList<>();
    }

    public Pedido(String nomeCliente, ArrayList<Prato_Bebida> itensConsumidos) {
        this.nomeCliente = nomeCliente;
        this.itensConsumidos = itensConsumidos;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public ArrayList<Prato_Bebida> getItensConsumidos() {
        return itensConsumidos;
    }

    public void setItensConsumidos(ArrayList<Prato_Bebida> itensConsumidos) {
        this.itensConsumidos = itensConsumidos;
    }

    @Override
    public String toString() {
        return "Pedido{" + "nomeCliente=" + nomeCliente + ", itensConsumidos=" + itensConsumidos + '}';
    }

    public double Troco() {
        double valorRecebido;
        Scanner sc = new Scanner(System.in);
        valorRecebido = sc.nextDouble();
        double somaItens = 0.0;
        for (Prato_Bebida p : itensConsumidos) {
            somaItens += p.getPreco();
        }
        double troco = (valorRecebido - somaItens);
        return troco;
    }

    public void NotaFiscal() {
        System.out.println("----Nota Fiscal-----");
        System.out.println("Itens consumidos:");
        double valorFinal = 0.0;
        for (Prato_Bebida p : itensConsumidos) {
            System.out.println(p);
            valorFinal += p.getPreco();
        }
        System.out.println("Valor da conta:" + valorFinal);
        System.out.println("Seu troco é de: " + Troco());

        System.out.println("------- OBRIGADO --------");
        System.out.println("----- VOLTE SEMPRE! -----");
    }

    
}
