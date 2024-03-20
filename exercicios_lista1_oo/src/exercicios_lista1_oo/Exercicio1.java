package exercicios_lista1_oo;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		int velMax, velMotorista, diferenca;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a velocidade máxima da via:"); 
		velMax = entrada.nextInt();
		System.out.print("Digite a velocidade do carro:");
		velMotorista = entrada.nextInt();
		
		diferenca =  velMotorista - velMax;
		
		if(diferenca == 0) {
			System.out.print("Não terá multa");
		}
		else if(diferenca <= 10 ) {
			System.out.print("multa de 50 reais");
		}
		else if(diferenca <=30 ) {
			System.out.print("multa de 100 reais");
		}
		else if(diferenca >=31) {
			System.out.print("multa de 200 reais");
		}
		
		entrada.close();
	}

}
