package exercicios_lista1_oo;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		String nome;
		int quantidade;
		double valor, desconto, total, totalPagar;
		NumberFormat casas = new DecimalFormat("#0.00");
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome do produto:");
		nome= entrada.nextLine();
		System.out.println("Digite quantidade de vendas:");
		quantidade = entrada.nextInt();
		System.out.println("Digite o valor:");
		valor= entrada.nextDouble();
		entrada.close();
		
		total= quantidade*valor;
		
		if(quantidade<=5) {
			desconto=total*0.02;
		}
		else {
			if(quantidade<=10) {
				desconto=total*0.03;
			}
			else {
				desconto=total*0.05;
			}
		}
		
		totalPagar= total - desconto;
		
		System.out.println("O total  do produto "+nome+" sem desconto é "+casas.format(total)+" o desconto é de "+casas.format(desconto)+" o total com desconto é "+casas.format(totalPagar));
		
	}

}
