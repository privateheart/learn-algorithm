package cha3_sort.bubble_sort;

/**
 * Created by chenchunli on 2017/7/14.
 */
public class BubbleArrayTest {
    public static void main(String[] args) {
        BubbleArray array = new BubbleArray(8);

        array.insert(3);
        array.insert(6);
        array.insert(1);
        array.insert(2);
        array.insert(8);
        array.insert(7);
        array.insert(4);
        array.insert(5);

        System.out.println("排序前");
        array.show();
        System.out.println("排序后");
        array.oddEvenSort();
        array.show();

    }
}
