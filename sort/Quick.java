package sort;

public class Quick {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 2, 5, 1, 3, 4};
        Quick quick = new Quick();
        quick.quickSort(arr, 0, arr.length-1);

        for (int n : arr) {
            System.out.printf("%d ", n);
        }
    }

    public void quickSort(int arr[], int left, int right) {
        if (left < right) {
            int pivot = partition(arr, left, right);

            quickSort(arr, left, pivot-1); // 분할된 왼쪽 배열
            quickSort(arr, pivot+1, right); // 분할된 오른쪽 배열
        }
    }

    public int partition(int arr[], int left, int right) {
        int pivot = arr[right];
        int i = (left - 1);

        for (int j = left; j <= right-1; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[right];
        arr[right] = temp;

        return (i + 1); // pivot의 위치 반환
    }
}
