/*Dado um vetor V = {5, 10, 8, 4, 9, 16, 28, 40, 80, 10} 
  criar um programa que efetua a soma dos valores e  imprima o resultado.*/
public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soma = 0;
		int lista[] = {5, 10, 8, 4, 9, 16, 28, 40, 80, 10};
		
		for (int i = 0; i < lista.length; i++) {
			soma = soma + lista[i];
		}
		
		System.out.println(soma);
		

	}

}
