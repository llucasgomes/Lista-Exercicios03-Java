/*Dado um vetor V = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, criar um programa que imprima este
conjunto acompanhado do seu elemento simétrico em relação a sua posição no conjunto,ou seja, 
a impressão será: 
1 - 10,
2 - 9,
3 - 8,
4 - 7,
5 - 6, 
6 - 5, 
7 - 4, 
8 - 3, 
9 - 2, 
10 - 1.*/
public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int lista[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int contador = lista.length;
		for(int i = 0; i < lista.length;i++){
			
			System.out.println(lista[i]+ "  "+ contador);
			contador--;
		}

	}

}
