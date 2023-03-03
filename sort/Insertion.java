package sort;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = {4, 2, 10, 26, 7, 1};

        // 기본 구현
        for (int i = 1; i < arr.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if (arr[j] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    i = j;
                }
            }
        }

        // 최적화 구현 (앞 원소들이 정렬된 경우)
        for (int i = 1; i < arr.length; i++) {
            int j = i-1;

            /**
             * 1. 타겟 앞의 원소의 idx가 0보다 크거나 같고
             * 2. 원소가 타겟보다 클 때
             * = 앞의 원소들 중 타겟보다 크면 swap하라
             */
            while(j >= 0 && arr[j] > arr[i]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i = j;
                j--;
            }
        }

        for (int n : arr) {
            System.out.printf("%d ", n);
        }
    }
}
