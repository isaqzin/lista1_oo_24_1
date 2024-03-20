package exercicios_lista1_oo;
import java.util.Scanner;

public class exercicio8 {
	public static void main(String[] args) {
		int numero;
		String[] extenso = {"zero", "um","dois","três","quatro","cinco","seis","sete","oito","nove","dez"};
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número de 0 a 10:");
		numero = entrada.nextInt();
		entrada.close();
		
		if(numero>10 || numero<0) {
			System.out.println("número invalido");
		}else {
			for(int i=0;i<=10;i++) {
				if(i==numero) {
					System.out.println(extenso[i]);
				}
			}
		}
	}
}

