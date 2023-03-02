package sort;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {3, 1, 9, 5, 7};
        int minIndex, temp;

        for (int i = 0; i < arr.length; i++) {
            minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // swap
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        for (int n : arr) {
            System.out.printf("%d ", n);
        }
    }
}
