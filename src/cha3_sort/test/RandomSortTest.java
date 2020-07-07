package cha3_sort.test;

import cha3_sort.bubble_sort.BubbleSort;
import cha3_sort.insert_sort.InsertSort;
import cha3_sort.select_sort.SelectSort;
import cha3_sort.homework.BubbleSortAdvanced;
import org.junit.Test;

import java.util.Random;

/**
 * Created by chenchunli on 2017/7/13.
 * 对随机数组进行排序
 *
 * 耗时: 插入排序(1033毫秒) < 选择排序(4590毫秒) < 冒泡排序(19858毫秒)
 */
public class RandomSortTest {

    @Test
    public  void testBubbleSort(){//冒泡排序，对随机数组排序耗时:19858毫秒
        int[] arr = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i] = new Random().nextInt(100000);
        }
        long start = System.currentTimeMillis();
        BubbleSort.bubbleSort(arr);
        long end = System.currentTimeMillis();
        System.out.println("冒泡排序，对随机数组排序耗时:"+(end-start) +"毫秒");
    }

    @Test
    public void testInserSort(){ //插入排序，对随机数组排序耗时:1033毫秒
        int[] arr = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i] = new Random().nextInt(100000);
        }
        long start = System.currentTimeMillis();
        InsertSort.insertSort(arr);
        long end = System.currentTimeMillis();
        System.out.println("插入排序，对随机数组排序耗时:"+(end-start) +"毫秒");
    }

    @Test
    public void testSelectSort(){ //选择排序，对随机数组排序耗时:4590毫秒
        int[] arr = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i] = new Random().nextInt(100000);
        }
        long start = System.currentTimeMillis();
        SelectSort.selectSort(arr);
        long end = System.currentTimeMillis();
        System.out.println("选择排序，对随机数组排序耗时:"+(end-start) +"毫秒");
    }

    @Test
    public void testAdvancedBubbleSort(){ //高级冒泡排序，对随机数组排序耗时:4590毫秒
        int[] arr = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i] = new Random().nextInt(100000);
        }
        long start = System.currentTimeMillis();
        BubbleSortAdvanced.bubbleSortAdvanced2(arr);
        long end = System.currentTimeMillis();
        System.out.println("高级冒泡排序，对随机数组排序耗时:"+(end-start) +"毫秒");
    }

}
