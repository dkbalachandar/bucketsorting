import java.util.Arrays;

public class BucketSort {

    public static void bucketSort(int[] array) {
        int i;
        int maxVal = array[0];
        for (i = 1; i < array.length; i++) {
            if (maxVal < array[i]) {
                maxVal = array[i];
            }
        }
        int[] bucketArray = new int[maxVal + 1];
        for (i = 0; i < bucketArray.length; i++) {
            bucketArray[i] = 0;
        }
        for (i = 0; i < array.length; i++) {
            bucketArray[array[i]]++;
        }
        int index = 0;
        for (i = 0; i < bucketArray.length; i++) {
            for (int j = 0; j < bucketArray[i]; j++) {
                array[index++] = i;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1, 8, 9};
        System.out.println("Before Bucket Sort. Data array is " + Arrays.toString(array));
        bucketSort(array);
        System.out.println("After Bucket Sort. Data array is " + Arrays.toString(array));
    }
}

