package application;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		// matriz é o nome dado a arranjos bidimensionais -> vetor de vetores
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		//Percorrer as linhas
		for (int i=0; i<mat.length; i++) {
			//Percorre as colunas
			for (int j=0; j<mat[i].length; j++) {
				mat [i][j] = sc.nextInt();
			}
		}
		
		//Pegar o valor da diagonal
		for (int i=0; i<mat.length; i++) {
			System.out.println(mat[i][i] + " ");
		}
		
		//Exibir os números negativos
		int count = 0;
		for (int i=0; i<n; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		
		System.out.println(("Negative numbers: " + count));
		
		sc.close();
	}

}
