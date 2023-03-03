package sort;

public class Quick {
    public static void main(String[] args) {
        int[] arr = new int[]{26, 10, 35, 19, 7, 3, 12};
        Quick quick = new Quick();
        quick.quickSortWithMiddlePivot(arr, 0, arr.length-1);

        for (int n : arr) {
            System.out.printf("%d ", n);
        }
    }

    public void quickSortWithMiddlePivot(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int pivot = arr[(left + right) / 2];
        int i = left;
        int j = right;

        while (i < j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i >= j) {
                break;
            }

            if (arr[i] == pivot && arr[j] == pivot) {
                i++;
            }

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        quickSortWithMiddlePivot(arr, left, i-1);
        quickSortWithMiddlePivot(arr, i+1, right);
    }
}
