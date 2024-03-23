package exercicios_lista1_oo;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Exercicio10 {
	public static void main(String[] args) {
		double total=0;
		double divisor=1, i;
		NumberFormat decimal = new DecimalFormat("#0.00");
		
		for( i=1;i<=50;i++ ) {
			total+= divisor/i;
			divisor+=2;
		}
		
		System.out.println(decimal.format(total));
	}
}
