package exercicios_lista1_oo;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		int day1,month1,year1;
		int day2,month2,year2;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a data 1 no seguinte formato XX/XX/XXXX:");
		String[] data1 = entrada.nextLine().split("/");
		day1= Integer.parseInt(data1[0]);
		month1= Integer.parseInt(data1[1]);
		year1= Integer.parseInt(data1[2]);
		
		System.out.println("Digite a data 2 no seguinte formato XX/XX/XXXX:");
		String[] data2 = entrada.nextLine().split("/");
		day2= Integer.parseInt(data2[0]);
		month2= Integer.parseInt(data2[1]);
		year2= Integer.parseInt(data2[2]);	
		entrada.close();
		
		if(year2<year1) {
			System.out.println("a data "+day1+"/"+month1+"/"+year1+"é maior");
		}else {
			if(month2<month1) {
				System.out.println("a data "+day1+"/"+month1+"/"+year1+" é maior");
			}else {
				if(day2<day1) {
					System.out.println("a data "+day1+"/"+month1+"/"+year1+" é maior");
				}else {
					if(day1==day2 && month1==month2 && year1==year2) {
						System.out.println("As datas são iguais");
					}else {
						System.out.println("a data "+day2+"/"+month2+"/"+year2+"é maior");
					}
				}
			}
		}
		

	}

}
