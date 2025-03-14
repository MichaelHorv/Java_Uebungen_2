package t2st3;

public class ArrayFunktionen {
	public static void printArray(int[] iArray) {
		for(int eineZahl : iArray) {
			System.out.print(eineZahl + " ");
		}
		System.out.println();
	}
		
	public static int[] swap(int[] iArray) {
		// 1 3 5 7 9 iArray
		// 9 7 5 3 1
		int[] r = new int[iArray.length];
		for(int i = 0; i < iArray.length; i++) {
			r[iArray.length - (1 + i)] = iArray[i];
		}
		return r;
		}
	
	public static void swapInPlace(int[] iArray) {
		// 1 3 5 7 9
		// 9       1
		//   7   3
		//     5
		int temp;
		for(int i = 0; i < iArray.length / 2; i++) {
			temp = iArray[iArray.length - (1 + i)];
			iArray[iArray.length - (1 + i)] = iArray[i];
			iArray[i] = temp;
		}
	}
}