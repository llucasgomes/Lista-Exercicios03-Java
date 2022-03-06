import java.util.Scanner;

/*Dado um vetor V = {56, 48, 9, 48, 60, 13, 24, 27, 13, 56, 85, 9, 48, 55, 9}, criar um programa que leia um 
número e informe na tela quantas vezes este número foi encontrado no vetor.*/
public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int list[] = {56, 48, 9, 48, 60, 13, 24, 27, 13, 56, 85, 9, 48, 55, 9};

		Scanner leitor = new Scanner(System.in);
		System.out.println("Vamos ver a quantidade de numeros");
		System.out.println();
		System.out.print("Insira o numero: ");
		int numero = leitor.nextInt();

		int x = 0;
		for (int i = 0; i < list.length; i++) {
			if (numero == list[i]) {
				x++;
			}
		}
		System.out.print("Total de numeros inseridos: "+ x);
		leitor.close();

	}

}
