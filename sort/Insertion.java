package sort;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = {3, 1, 9, 5, 7};

        /*
         * 기본 구현
         */
        for (int i = 1; i < arr.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if (arr[j] > arr[i]) {
                    // swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        /*
        * 최적화 구현 (앞 원소들이 정렬된 경우)
        */
        for (int i = 1; i < arr.length; i++) {
            int j = i-1;

            /**
             * 조건: 타겟 앞의 원소의 idx가 0보다 크거나 같다 && 원소가 타겟보다 크다
             * = 앞의 원소들 중 타겟보다 크면 swap하라
             */
            while(j >= 0 && arr[j] > arr[i]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j--;
            }
        }

        for (int n : arr) {
            System.out.printf("%d ", n);
        }
    }
}
