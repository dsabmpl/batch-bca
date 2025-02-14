public class SearchOccurence {
    static int[] occurence(int[] arr, int ele, int i, int count) {
        if (i == arr.length) {
            return new int[count];
        }
        if (arr[i] == ele) {
            count++;
        }
        int result[] = occurence(arr, ele, i + 1, count);
        if (arr[i] == ele) {
            result[--count] = i;
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 50, 40, 50 };
        int searchElement = 50;
        int result[] = occurence(arr, searchElement, 0, 0);
        for (int i : result) {
            System.out.print(i + " ");
        }

    }

}
