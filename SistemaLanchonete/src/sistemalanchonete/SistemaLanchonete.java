package sistemalanchonete;
import Produtos.Bebida;
import Produtos.Doce;
import Produtos.Pastel;
import Produtos.Salgado;
import Produtos.Pedido;
import Produtos.Prato_Bebida;
import java.util.ArrayList;
import java.util.Scanner;


public class SistemaLanchonete {

    static ArrayList<Pedido> Pedidos = new ArrayList<>();
    static ArrayList<Prato_Bebida> ProdutosDisponiveis = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        Cardapio();

        int op = 0;

        while (true) {
            System.out.println("----Bem vindos----\n");
            System.out.println("1) Fazer pedido \n2) sair");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    FazerPedido();
                    break;
                case 2:
                    return;
            }
        }
        
            
        
    }
    public static void Cardapio(){
        
       Pastel p1 = new Pastel("Carne/c Queijo", 6.00);
       Pastel p2 = new Pastel("Frango/c Catupiry", 6.00);
       Pastel p3 = new Pastel("Portuguesa", 6.00);
       Pastel p4 = new Pastel("Calabresa/c Queijo", 6.00);
       Pastel p5 = new Pastel("Pizza", 6.00);
       Pastel p6 = new Pastel("Bauru", 6.00);
       
       
       Salgado s1 = new Salgado("Coxinha", 4.00);
       Salgado s2 = new Salgado("Quibe", 4.00);
       Salgado s3 = new Salgado("Enrolado de Salsicha", 4.00);
       Salgado s4 = new Salgado("Risole", 4.00);
       Salgado s5 = new Salgado("Bolinho de Carne", 4.00);
       
       
       Bebida b1 = new Bebida("Coca-Cola 350ml", 4.00);
       Bebida b2 = new Bebida("Água Mineral", 2.00);
       Bebida b3 = new Bebida("Guaraná 350ml", 4.00);
       Bebida b4 = new Bebida("Fanta Uva 350ml", 4.00);
       Bebida b5 = new Bebida("Suco de Acerola c/ Laranja", 5.00);
       Bebida b6 = new Bebida("Suco de Abacaxi", 5.00);
       Bebida b7 = new Bebida("Suco de Maracujá", 5.00);
       
       Doce d1 = new Doce("Pedaço Bolo de Chocolate", 6.00);
       Doce d2 = new Doce("Pedaço Bolo de Chocolate/c Prestigio", 6.00);
       Doce d3 = new Doce("Pudim", 4.00);
       Doce d4 = new Doce("Pavê de Chocolate", 4.00);
       
       
       ProdutosDisponiveis.add(p1);
       ProdutosDisponiveis.add(p2);
       ProdutosDisponiveis.add(p3);
       ProdutosDisponiveis.add(p4);
       ProdutosDisponiveis.add(p5);
       ProdutosDisponiveis.add(p6);
       
       ProdutosDisponiveis.add(s1);
       ProdutosDisponiveis.add(s2);
       ProdutosDisponiveis.add(s3);
       ProdutosDisponiveis.add(s4);
       ProdutosDisponiveis.add(s5);
       
       ProdutosDisponiveis.add(b1);
       ProdutosDisponiveis.add(b2);
       ProdutosDisponiveis.add(b3);
       ProdutosDisponiveis.add(b4);
       ProdutosDisponiveis.add(b5);
       ProdutosDisponiveis.add(b6);
       ProdutosDisponiveis.add(b7);
            
       ProdutosDisponiveis.add(d1);
       ProdutosDisponiveis.add(d2);
       ProdutosDisponiveis.add(d3);
       ProdutosDisponiveis.add(d4);       
 
       
    }
    public static void FazerPedido() {
        Pedido pedido = new Pedido();
        System.out.println("Nome do cliente: ");
        String nome = sc.next();
        
        pedido.setNomeCliente(sc.nextLine());
        int op = -1;
        while (true) {
            for (int i = 0; i < ProdutosDisponiveis.size(); i ++){
                System.out.println(i + ")" + ProdutosDisponiveis.get(i).getNome());
            }
            System.out.println("Digite 0 para encerrar o pedido");
            op = sc.nextInt();
            if(op != 0 ){
                ArrayList<Prato_Bebida> temp = new ArrayList<>();
                
                temp = pedido.getItensConsumidos();
                System.out.println(temp);
                temp.add(ProdutosDisponiveis.get(op));
                pedido.setItensConsumidos(temp);
            }else{
                break;
            }
        }
       
        pedido.NotaFiscal();
        
    }
    
}
