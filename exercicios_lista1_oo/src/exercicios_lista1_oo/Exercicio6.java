package exercicios_lista1_oo;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		int numPrimo, contador=0,divisor;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o numero:");
		numPrimo= entrada.nextInt();
		entrada.close();
		for(divisor=numPrimo;divisor>0;divisor--) {
			if(numPrimo%divisor==0) {
				contador++;
			}
		}
		if(contador!=2) {
			System.out.println("nao é primo");
		}else {
			System.out.println("é primo");
		}

	}

}
