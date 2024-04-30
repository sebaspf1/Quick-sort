package assignment7;

import java.util.*;

public class IntegerQuickSort {
	public void quickSort(int[] A, int lowerBound, int upperBound) {
		if(lowerBound < upperBound) {
			int pivot = randomizedPartition(A, lowerBound, upperBound);
			quickSort(A, lowerBound, pivot - 1);
			quickSort(A, pivot + 1, upperBound);
		}
	}
	
	public int randomizedPartition(int[] A, int lowerBound, int upperBound) {		
		Random rand= new Random(); 
        int pivot = rand.nextInt(upperBound-lowerBound)+lowerBound; 
        
        int temp = A[pivot];
        A[pivot] = A[upperBound];
        A[upperBound] = temp;
        
        return partition(A, lowerBound, upperBound);
	}
	
	public int partition(int[] A, int lowerBound, int upperBound) {
		int pivot = A[upperBound];
		int i = lowerBound - 1;
		for(int j = lowerBound; j < upperBound; j++) {
			if(A[j] <= pivot) {
				i = i + 1;
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
		}
		int temp = A[++i];
		A[i] = A[upperBound];
		A[upperBound] = temp;
		return i;
	}
}
