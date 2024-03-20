package exercicios_lista1_oo;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		char n;
		Scanner entrada  = new Scanner(System.in);
		
		System.out.print("digite um caracter:");
		n= entrada.next().charAt(0);
		
		if(Character.isDigit(n)) {
			System.out.print("é um número");
		}else {
			 if(Character.isLetter(n)) {
				if(n =='a'|| n =='e' || n=='i'|| n=='o'|| n=='u'||n =='A'|| n =='E' || n=='I'|| n=='O'|| n=='U') {
					System.out.print("É vogal");
				}else {
						System.out.print("É consoante");
				}
			}else {
				System.out.print("é um caracter qualquer");
			}
		}
		entrada.close();
	}
}
