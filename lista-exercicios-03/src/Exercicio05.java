/*Dado um vetor V = {91, 10, 50, 89, 45, 80, 2, 45, 3, 105, 95, 13, 26, 49, 50}, 
 *criar um programa a que receba um número pelo teclado, verifique e imprima na tela
 *se este número existe no vetor.*/
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int list[] = {91, 10, 50, 89, 45, 80, 2, 45, 3, 105, 95, 13, 26, 49, 50};
		
		Scanner leitor = new Scanner(System.in);
		System.out.print("Insira o numero: ");
		int numero = leitor.nextInt();
		
		int x=0;
		for(int i =0;i < list.length; i++) {
			if ( numero == list[i]) {
				x++;
			}
		}
		switch (x) {
		case 0:
			System.out.print("Este numero não existe");
			break;

		default:
			System.out.print("Seu numero consta na lista");
			break;
		}
		
		leitor.close();
		
	
		
		
		

	}

}
