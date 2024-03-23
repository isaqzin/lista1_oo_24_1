package exercicios_lista1_oo;
import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		int alturaAlunoMenor=1000, alturaAlunoMaior=0, quantidadeAluno;
		int posicaoMaior=0, posicaoMenor=0, i=0;
		int alturaAlunoProvisorio;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantas pessoas vamos analisar?");
		quantidadeAluno= entrada.nextInt();
		System.out.println("Digite numero depois altura em cm");
		
		while(quantidadeAluno!=0) {
			alturaAlunoProvisorio = entrada.nextInt();
			i++;
			
			if(alturaAlunoProvisorio>alturaAlunoMaior) {
				alturaAlunoMaior=alturaAlunoProvisorio;
				posicaoMaior= i;
			}
			 if(alturaAlunoProvisorio<alturaAlunoMenor) {
				alturaAlunoMenor=alturaAlunoProvisorio;
				posicaoMenor= i;
			}
			quantidadeAluno--;
		}
		
		entrada.close();
		
		System.out.println("O menor aluno é o de numero"+ posicaoMenor+" de altura " + alturaAlunoMenor);
		System.out.println("O maior aluno é o de numero"+ posicaoMaior+" de altura " + alturaAlunoMaior);
	}
}
