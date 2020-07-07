package cha3_sort.insert_sort;

/**
 * Created by chenchunli on 2017/7/13.
 */
public class InsertSort {

    /**
     * 插入排序
     * @param arr
     */
    public static void insertSort2(int[] arr){
        //假设 i 之前的 元素是有序的,将i+1位置的元素取出来，和它之前的元素比较，并将之前的元素向后移动一个位置，插入合适的位置 i++
        int temp;
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            for (int j=(i-1); j>=0; j--){
                if (arr[j] > temp){ //后移一位
                    arr[j+1] = arr[j];
                    if (j==0){
                        arr[0] = temp;
                        break;
                    }
                }else {
                    arr[j+1] = temp;
                    break;
                }
            }
        }

    }

    public static int median(int[] arr){
        int temp = 0;
        int n;
        int median = 0;
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            n = i;
            while (n >0 && arr[n-1] > temp){
                arr[n] = arr[n-1];
                n--;
            }
            arr[n] = temp;
            if (n == arr.length/2){
                median =temp;
            }

        }
        return median;
    }

    public static int median2(int[] sortedArr){
        return sortedArr[(sortedArr.length-1)/2];
    }

    public static void insertSort(int[] arr){
        int in;
        int i;
        int temp;
        for (i = 0; i < arr.length; i++) {
            in = i;
            temp = arr[i];
            while (in>0 && arr[in-1] >= temp){
                arr[in] = arr[in-1];
                in--;
            }
            arr[in] = temp;
        }

    }

    public static void insertSortNodups(int[] arr){
        int in;
        int i;
        int temp;
        for (i = 0; i < arr.length; i++) {
            in = i;
            temp = arr[i];
            while (in>0 && arr[in-1] > temp){
                arr[in] = arr[in-1];
                in--;
            }
            if (arr[in] != temp){
                arr[in] = temp;
            }else {//数据重复
                while (in < i){
                    arr[in] = arr[in+1];
                    in++;
                }
                while (i<arr.length-1){
                    arr[i] = arr[i+1];
                    i++;
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

        int[]  arr = new int[]{2,3,1,8,8,8,8,5,7,4};

        System.out.println("插入排序之前");
        showArr(arr);
        System.out.println("排序前数组中间值:"+ median(arr));

//      insertSort(arr);
//      insertSort2(arr);
        insertSortNodups(arr);
        System.out.println("插入之后");
        showArr(arr);

        System.out.println("排序后数组中间值:"+ median2(arr));

    }


}
