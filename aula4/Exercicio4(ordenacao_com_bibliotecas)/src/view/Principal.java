package view;

import libBubbleSort.Bubble_sort;
import libMergeSort.MergeSort;

public class Principal {

	public static void main(String[] args) {
		MergeSort OrdenaMS = new MergeSort();
		Bubble_sort OrdenaBS = new Bubble_sort();	
		
		int[] vet1 = {74, 20, 71, 87, 81, 16, 25, 99, 44, 58};
		int tamanho = vet1.length - 1;
		int[] vet1OrdenadoB = OrdenaBS.ordenacao(vet1, tamanho);
		int[] vet1OrdenadoM = OrdenaMS.ordenacao(vet1, 0, tamanho);
		
		System.out.print("Vetor 1 ordenado com Bubble sort: ");
		for(int i=0; i<=tamanho;i++) {
			System.out.print(vet1OrdenadoB[i] + " ");	
		}
		System.out.print("\nVetor 1 ordenado com Merge sort: ");
		for(int i=0; i<=tamanho;i++) {
			System.out.print(vet1OrdenadoM[i] + " ");
			
		}
		
		int[] vet2 = {44, 43, 42, 41, 40, 39, 38};
		int tamanho2 = vet2.length - 1;
		int[] vet1OrdenadoB2 = OrdenaBS.ordenacao(vet2, tamanho2);
		int[] vet1OrdenadoM2 = OrdenaMS.ordenacao(vet2, 0, tamanho2);
		
		System.out.print("\n\nVetor 2 ordenado com Bubble sort: ");
		for(int i=0; i<=tamanho2;i++) {
			System.out.print(vet1OrdenadoB2[i] + " ");	
		}
		System.out.print("\nVetor 1 ordenado com Merge sort: ");
		for(int i=0; i<=tamanho2;i++) {
			System.out.print(vet1OrdenadoM2[i] + " ");
			
		}
	}

}
