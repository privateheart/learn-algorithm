package cha3_sort.homework;

/**
 * Created by chenchunli on 2017/7/13.
 */
public class BubbleSortAdvanced {

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

    /**
     *高级冒泡排序
     * @param arr
     */
    public static void bubbleSortAdvanced(int[] arr){
        int temp = 0;
        int min = -1;
        int minIndex = 0;

        int max = 0;
        int maxIndex = arr.length-1;
        for (int k= arr.length-1; k>minIndex; k--){

            //将最大的数移动到最后位置
            for (int i = minIndex; i < k; i++) {
                if (arr[i] > arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }

            //将最小的数放在第一个位置
            min = k-1;
            for (int n = k-1; n >minIndex ; n--) {
                if (arr[n-1] < arr[min]){
                   min = n-1;
                }
            }

            if (min !=-1){
                //minIndex 位置上的元素和 他后面元素中最小元素交换位置
                temp = arr[min];
                arr[min] = arr[minIndex];
                arr[minIndex] = temp;
                minIndex++;
                min = -1;
            }

        }
    }

    /**
     *高级冒泡排序
     * @param arr
     */
    public static void bubbleSortAdvanced2(int[] arr){

        int temp;

        int min = -1;
        int minIndex = 0;

        int max = -1;
        for (int maxIndex= arr.length-1; maxIndex>minIndex; maxIndex--){

            //将最大的数移动到最后位置
            max = maxIndex;
            for (int i = minIndex; i < maxIndex; i++) {
                if (arr[max] < arr[i+1]){
                  max = i+1;
                }
            }
            //maxIndex位置上的元素和 他之前最大元素 交换位置
            if (max != -1 && max != maxIndex){
                //maxIndex 位置上的元素和 他后面元素中最小元素交换位置
                temp = arr[max];
                arr[max] = arr[maxIndex];
                arr[maxIndex] = temp;
                max = -1;
            }

            min = minIndex;
            //将最小的数放在第一个位置
            for (int n = maxIndex; n >minIndex ; n--) {
                if (arr[n-1] < arr[min]){
                    min = n-1;
                }
            }
            if (min !=-1){
                //minIndex 位置上的元素和 他后面元素中最小元素交换位置
                temp = arr[min];
                arr[min] = arr[minIndex];
                arr[minIndex] = temp;
                minIndex++;
                min = -1;
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,13,3,11,12,1,8,4,9};
        System.out.println("排序之前:");
        showArr(arr);
        bubbleSortAdvanced2(arr);
        System.out.println("排序之后:");
        showArr(arr);
    }
}
