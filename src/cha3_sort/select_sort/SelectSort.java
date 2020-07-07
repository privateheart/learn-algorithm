package cha3_sort.select_sort;

/**
 * Created by chenchunli on 2017/7/13.
 * 1.假设第一个位置放最小的元素，将第一个元素和后面所有元素比较，找出最小的元素位置，然后和第一个元素位置交换
 */
public class SelectSort {

    /**
     * 选择排序
     * @param arr
     */
    public static void selectSort(int[] arr){
        int min;
        int temp;
        for (int i=0; i<arr.length-1; i++){
            //循环遍历找出最小的 元素位置
            min = i;
            for (int j = (i+1); j <arr.length ; j++) {
                if (arr[min] > arr[j]){
                    min = j;
                }
            }
            //第一个和最小一个交换位置
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
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

        System.out.println("选择排序之前");
        showArr(arr);

        selectSort(arr);

        System.out.println("排序之后");
        showArr(arr);
    }
}
