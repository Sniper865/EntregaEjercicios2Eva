package EjerciciosMatriz;

public class ej3_mostrarRellenar {

	public static void main(String[] args) {
		int[][] mat = new int[5][5];
		int k = 0;
		
		for (int i = 0; i < mat.length; i++)
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = k;
				k += 5;
				
			}
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + "\t");
		
			}
			System.out.println("\n\n\n");
			
		}
				
	}

}
