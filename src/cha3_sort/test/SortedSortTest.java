package cha3_sort.test;

import cha3_sort.bubble_sort.BubbleSort;
import cha3_sort.insert_sort.InsertSort;
import cha3_sort.select_sort.SelectSort;
import org.junit.Test;

/**
 * Created by chenchunli on 2017/7/13.
 * 有序数组 进行排序
 * 耗时：  插入排序(4ms) <<< 选择排序(1264ms) <= 冒泡排序(1270ms)
 */
public class SortedSortTest {

    @Test
    public  void testBubbleSort(){//冒泡排序，对随机数组排序耗时:1270毫秒
        int[] arr = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i] = i;
        }
        long start = System.currentTimeMillis();
        BubbleSort.bubbleSort(arr);
        long end = System.currentTimeMillis();
        System.out.println("冒泡排序，对随机数组排序耗时:"+(end-start) +"毫秒");
    }

    @Test
    public void testInserSort(){ //插入排序，对随机数组排序耗时:4毫秒s
        int[] arr = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i] = i;
        }
        long start = System.currentTimeMillis();
        InsertSort.insertSort(arr);
        long end = System.currentTimeMillis();
        System.out.println("插入排序，对随机数组排序耗时:"+(end-start) +"毫秒");
    }

    @Test
    public void testSelectSort(){ //选择排序，对随机数组排序耗时:1264毫秒
        int[] arr = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i] = i;
        }
        long start = System.currentTimeMillis();
        SelectSort.selectSort(arr);
        long end = System.currentTimeMillis();
        System.out.println("选择排序，对随机数组排序耗时:"+(end-start) +"毫秒");
    }
}
