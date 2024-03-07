package view;

import controller.MatrizThread;

public class Main {

	public static void main(String[] args) {
		
		int[][] mat = new int[3][5];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				mat[i][j] = (int) (Math.random() * 101);
			}
		}
		
		
		for (int i = 0; i < 3; i++) {
			Thread soma = new MatrizThread(mat[i]);
			soma.start();
		}
	}

}
