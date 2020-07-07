package cha2_array;

import org.junit.Test;

/**
 * Created by chenchunli on 2017/7/12.
 */
public class TestOrderedArray {

    @Test
    public void testOrderedArray(){
        OrderedArray orderedArray = new OrderedArray(6);

        orderedArray.insert(1);
        orderedArray.insert(7);
        orderedArray.insert(9);
        orderedArray.insert(11);
        orderedArray.insert(5);
        orderedArray.insert(3);
        System.out.println("数组数据:");
        orderedArray.display();
        System.out.println("删除数据：9");
        orderedArray.delete(9);

        System.out.println("显示数据:");
        orderedArray.display();

        System.out.println("添加数据8");
        orderedArray.insert(8);

        System.out.println("显示数据：");
        orderedArray.display();
        int index = orderedArray.find(8);
        System.out.println("查询数据8的位置:"+index);
    }
}
