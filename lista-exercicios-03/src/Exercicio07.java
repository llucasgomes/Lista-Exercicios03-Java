/*Criar um programa preencha um vetor de inteiros de 10 posi��es, via teclado. Ap�s o preenchimento do 
vetor, o programa dever� verificar quais s�o os elementos �mpares e gerar um novo vetor com esses elementos. Por 
fim, o programa dever� exibir na tela os dois vetores.*/
import java.util.Scanner;

public class Exercicio07 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int list[] = new int[10];
		String list2[] = new String[10];
		Scanner read = new Scanner(System.in);
		
		for (int i = 0; i < list.length;i++) {
			System.out.printf("Insira o %d� valor:  ",i+1); 
			list[i] = read.nextInt();
			
			
		}
		for (int i = 0;i < list.length;i++) {
			
			if(list[i] % 2 == 0) {
				list2[i] = "Par";
			}else {
				list2[i] = "�mpar";
			}
		}
		
		
		for (int i= 0;i < list.length;i++) {
			System.out.println(list[i] +" >>> "+list2[i]);
		}
			
		
		

	}

}
