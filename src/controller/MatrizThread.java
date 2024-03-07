package controller;

public class MatrizThread extends Thread {

	private int[] vet = new int[5];

	public MatrizThread(int[] vet) {
		this.vet = vet;
	}

	@Override
	public void run() {
		System.out.println("Linha #"+ getId()+ " " + Soma(5));
	}

	private int Soma(int l) {
		if (l == 0) {
			return 0;
		}
		int soma = vet[l-1] + Soma(l - 1);
		return soma;
	}
}
