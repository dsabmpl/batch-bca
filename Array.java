public class Array {
    static void isSorted(int[] arr, int i) {
        if (i == arr.length - 1) {
            System.out.println("The Array is Sorted ");
            return;
        }

        if (arr[i] > arr[i + 1]) {
            System.out.println("The Array is Not Sorted ");
            return;
        }

        isSorted(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 4 };
        isSorted(arr, 0);

    }

}
