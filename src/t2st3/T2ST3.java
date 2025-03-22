package t2st3;

public class T2ST3 {
    public static void main(String[] args) {
        int[] a = {1,3,5,7,9,11};
        ArrayFunktionen.printArray(a);
        int[] b = ArrayFunktionen.swap(a);
        ArrayFunktionen.printArray(b);
        ArrayFunktionen.swapInPlace(b);
        ArrayFunktionen.printArray(b);
    }
}
