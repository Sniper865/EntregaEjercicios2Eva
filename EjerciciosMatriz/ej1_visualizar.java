package EjerciciosMatriz;

import java.util.*;

public class ej1_visualizar {

	// Introducir y visualizar elementos en matriz de 3 x 5.
	
	public static int[][] arrayFill(int[][] mat) {
		Random random = new Random();
		
		for (int i = 0; i < mat.length; i++)
			for (int j = 0; j < mat[i].length; j++)
				mat[i][j] = random.nextInt(101);
				
		return mat;
		
	}

	public static void main(String[] args) {
		System.out.println("\n\n");
		
		int[][] mat = new int[3][5];
		
		mat = arrayFill(mat);
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + "\t");
		
			}
			System.out.println("\n\n\n");
			
		}
		
	}

}
