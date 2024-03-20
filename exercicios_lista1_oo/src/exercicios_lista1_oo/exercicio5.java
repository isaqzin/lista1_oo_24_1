package exercicios_lista1_oo;
import java.util.Scanner;
public class exercicio5 {

	public static void main(String[] args) {
		String usuario= "1234";
		String senha = "9999";
		String usuarioRecebido, senhaRecebida;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o usuario:");
		usuarioRecebido = entrada.nextLine();
		
		if(usuario.equals(usuarioRecebido)) {
			System.out.println("Digite a senha:");
			senhaRecebida= entrada.nextLine();
			if(senha.equals(senhaRecebida)) {
				System.out.println("Acesso permitido");
			}else {
				System.out.println("Senha incorreta");
			}
		}else {
			System.out.println("Usuario invalido");
		}
		
		entrada.close();
	}

}
