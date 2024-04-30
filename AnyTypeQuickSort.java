package assignment7;

import java.util.*;

public class AnyTypeQuickSort <T extends Comparable<? super T>>{
	public void quickSort(T[] A, int lowerBound, int upperBound) {
		if(lowerBound < upperBound) {
			int pivot = randomizedPartition(A, lowerBound, upperBound);
			quickSort(A, lowerBound, pivot - 1);
			quickSort(A, pivot + 1, upperBound);
		}
	}
	
	public int randomizedPartition(T[] A, int lowerBound, int upperBound) {		
		Random rand= new Random(); 
        int pivot = rand.nextInt(upperBound-lowerBound)+lowerBound; 
        
        T temp = A[pivot];
        A[pivot] = A[upperBound];
        A[upperBound] = temp;
        
        return partition(A, lowerBound, upperBound);
	}
	
	public int partition(T[] A, int lowerBound, int upperBound) {
		T pivot = A[upperBound];
		int i = lowerBound - 1;
		for(int j = lowerBound; j < upperBound; j++) {
			if(A[j].compareTo(pivot) <= 0) {
				i = i + 1;
				T temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
		}
		T temp = A[++i];
		A[i] = A[upperBound];
		A[upperBound] = temp;
		return i;
	}
}
