package digitalone.aula3.java.programar;
import digitalone.aula3.Invoice;

import java.util.Scanner;

public class InvoiceTeste {

    public static void main (String [] args )
    {

        Invoice invoice = new Invoice();
        Scanner input = new Scanner(System.in);




        System.out.print("Digite o codigo do cliente: ");
        String numero = input.nextLine();
        invoice.setNumero(numero);

        System.out.print("Informe a Descrição do produto: ");
        String descricao = input.nextLine();
        invoice.setDescricao(descricao);

        System.out.print("Informe a quantidade: ");
        int quantidade = input.nextInt();
        invoice.setQuantidade(quantidade);

        System.out.print("Informe o preço do produto: ");
        double preco = input.nextDouble();
        invoice.setPreco(preco);

        System.out.printf("\nNúmero do cliente é: %s%n%n: ",
                invoice.getNumero());

        System.out.printf("Descrição  do item: %s%n%n: ",
                invoice.getDescricao());

        System.out.printf("A quantidade do itens no pedido: %d%n%n: ",
                invoice.getQuantidade());

        System.out.printf("O valor do item: $%.2f%n%n",
                invoice.getPreco());

        System.out.printf("O resultado valor final é $%.2f: ",
                invoice.getInvoiceAmount());





    }
}
