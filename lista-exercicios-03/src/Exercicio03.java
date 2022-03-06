/*Dado um vetor V = {85.0, 105.0, 40.0, 90.0, 35.0, 65.0, 33.0, 22.0, 19.0, 50.0},
criar um programa que efetua a média dos valores e imprima o resultado.*/
public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double media = 0;
		double lista[] = {85.0, 105.0, 40.0, 90.0, 35.0, 65.0, 33.0, 22.0, 19.0, 50.0};
		
		for (int i = 0; i < lista.length; i++) {
			media = media + lista[i];
		}
		media = media / (lista.length);
				System.out.println(media);
				

	}

}
