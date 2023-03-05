package sort;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = {4, 2, 10, 26, 7, 1};

        for (int i = 1; i < arr.length; i++) {
            int target = arr[i];

            int j;
            for (j = i-1; j >= 0 && arr[j] > target; j--) { // 앞의 원소가 타겟보다 작으면 멈춘다.
                arr[j+1] = arr[j];
            }
            arr[j+1] = target;
        }

        for (int n : arr) {
            System.out.printf("%d ", n);
        }
    }
}
