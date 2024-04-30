package assignment7;

public class Main {

	public static void main(String[] args) {
		int[] a = {12, 7, 34, 3, 4, 21, 8, 1, 15};
		IntegerQuickSort sorter = new IntegerQuickSort();
		sorter.quickSort(a, 0, a.length - 1);
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		Double[] b = {5.13, 6.12, 1.1, 6.00, 5.1, 9.65, 9.66};
		AnyTypeQuickSort<Double> doubleSorter = new AnyTypeQuickSort<>();
		doubleSorter.quickSort(b, 0, b.length - 1);
		for(int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		
		System.out.println();
		
		String[] c = {"jqpiwofej", "ajso", "fioqojwpe", "fkdajs", "iqpejf", "pjajsodasdf"};
		AnyTypeQuickSort<String> stringSorter = new AnyTypeQuickSort<>();
		stringSorter.quickSort(c, 0, c.length - 1);
		for(int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}

}
