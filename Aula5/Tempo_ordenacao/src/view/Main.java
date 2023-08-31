package view;

import libBubbleSort.Bubble_sort;
import libMergeSort.MergeSort;
import libQuickSort.QuickSort;

public class Main {

	public static void main(String[] args) {
		QuickSort quick =new QuickSort();
		Bubble_sort bubble = new Bubble_sort();
		MergeSort merge =new MergeSort();
		
		int[] vetor = new int[1500];
		int c = 1499;
		for(int i=0; i<1499; i++) {
			vetor[i] = c;
			c--;
		}
		int tamanho = vetor.length -1;
		
		//bubble sort
		double TempoInicialB = System.nanoTime();
		bubble.ordenacao(vetor, tamanho);
		double TempoFinalB = System.nanoTime();
		double TempoTotalB = TempoFinalB - TempoInicialB;
		TempoTotalB = TempoTotalB / Math.pow(10, 9);
		System.out.println("Tempo por bubble sort: " + TempoTotalB + ".s");
		
		//merge sort
		
		int[] vetor2 = new int[1500];
		c = 1499;
		for(int i=0; i<1499; i++) {
			vetor[i] = c;
			c--;
		}
		int tamanho2 = vetor2.length -1;
		
		double TempoInicialM = System.nanoTime();
		merge.ordenacao(vetor2, 0, tamanho2);
		double TempoFinalM = System.nanoTime();
		double TempoTotalM = TempoFinalM - TempoInicialM;
		TempoTotalM = TempoTotalM / Math.pow(10, 9);
		System.out.println("Tempo por merge sort: " + TempoTotalM + ".s");
		
		//quick sort
		
		int[] vetor3 = new int[1500];
		c = 1499;
		for(int i=0; i<1499; i++) {
			vetor[i] = c;
			c--;
		}
		int tamanho3 = vetor2.length -1;
		
		double TempoInicialQ = System.nanoTime();
		quick.quicksort(vetor3, c, tamanho3);
		double TempoFinalQ = System.nanoTime();
		double TempoTotalQ = TempoFinalQ - TempoInicialQ;
		TempoTotalQ = TempoTotalQ / Math.pow(10, 9);
		System.out.println("Tempo por quick sort: " + TempoTotalQ + ".s");
	}

}
