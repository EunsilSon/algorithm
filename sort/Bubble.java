package sort;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {3, 1, 9, 5, 7};

        for (int i = arr.length-1; i > 0; i--) { // 1회전 마다 반복 값이 줄어듦
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int n : arr) {
            System.out.printf("%d ", n);
        }
    }
}
