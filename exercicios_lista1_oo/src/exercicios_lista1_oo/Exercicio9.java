package exercicios_lista1_oo;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Exercicio9 {
	public static void main(String[] args ) {
		double celsius, fahrenheit;
		NumberFormat decimal = new DecimalFormat("#0.00");
		
		System.out.println("fahrenheit | celsius \n");
		
		for(celsius= 50;celsius<=65;celsius++) {
			fahrenheit= (celsius*1.8)+32;
			System.out.println("    "+decimal.format(fahrenheit)+" | "+decimal.format(celsius));
		}
	}
}
