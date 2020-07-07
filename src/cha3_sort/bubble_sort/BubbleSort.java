package cha3_sort.bubble_sort;

/**
 * Created by chenchunli on 2017/7/12.
 */
public class BubbleSort {

    /**
     * 冒泡排序
     * @param arr
     * @return
     */
    public static void bubbleSort(int[] arr){
        int temp = 0;
        for (int k= arr.length-1; k>0; k--){
            for (int i = 0; i < k; i++) {
                if (arr[i] > arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }

    public static void showArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[]  arr = new int[]{2,3,1,7,4};

        System.out.println("冒泡排序之前");
        showArr(arr);

        bubbleSort(arr);

        System.out.println("排序之后");
        showArr(arr);
    }
}
