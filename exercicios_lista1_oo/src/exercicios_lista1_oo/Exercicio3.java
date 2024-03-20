package exercicios_lista1_oo;
import java.util.Scanner;
import java.text.*;

public class Exercicio3 {

	public static void main(String[] args) {
		double a, b, c, delta, r1,r2;
		Scanner entrada = new Scanner(System.in); 
		NumberFormat descimal= new DecimalFormat("#0.00");
		
		System.out.println("Digite o coeficiente A da sua equação de segundo grau:");
		a= entrada.nextDouble();
		System.out.println("Digite o coeficiente B da sua equação de segundo grau:");
		b= entrada.nextDouble();
		System.out.println("Digite o coeficiente C da sua equação de segundo grau:");
		c= entrada.nextDouble();
		
		delta= b*b - 4*a*c;
		
		if(delta<0) {
			System.out.println("o delta tem valor negativo, não tem raiz real");
		}else {
			r1=(-b+ Math.sqrt(delta))/(2*a);
			r2=(-b- Math.sqrt(delta))/(2*a);
			System.out.println("Sua primeira Raíz é "+descimal.format(r1)+"\nSua segunda Raíz é "+descimal.format(r2));
		}
		entrada.close();
		}

}
