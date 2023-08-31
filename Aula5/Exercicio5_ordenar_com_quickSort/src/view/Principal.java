package view;

import libQuickSort.QuickSort;

public class Principal {

	public static void main(String[] args) {
		QuickSort quick =new QuickSort();
		int[] vetor1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		int fim1 = vetor1.length - 1;
		int[] vetor1Ordenado = quick.quicksort(vetor1, 0, fim1);
		System.out.print("Vetor 1 ordenado: ");
		for(int i: vetor1Ordenado) {
			System.out.print(i +" ");
		}
		
		int[] vetor2 = {44,43,42,41,40,39,38};
		int fim2 = vetor2.length - 1;
		int[] vetor2Ordenado = quick.quicksort(vetor2, 0, fim2);
		System.out.print("\nVetor 2 ordenado: ");
		for(int i: vetor2Ordenado) {
			System.out.print(i +" ");
		}
		
		int[] vetor3 = {31,32,33,34,99,98,97,96};
		int fim3 = vetor3.length - 1;
		int[] vetor3Ordenado = quick.quicksort(vetor3, 0, fim3);
		System.out.print("\nVetor 3 ordenado: ");
		for(int i: vetor3Ordenado) {
			System.out.print(i +" ");
		}
	}
}
