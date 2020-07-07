package cha6_recursion;

import java.util.ArrayList;

/**
 * 递归经典问题   背包问题
 *  将不同重量的数据项放到背包中，以使背包最后达到指定的总重量。不需要把所有的选项都放入背包中。
 *
 *  举例来说，假设想要背包精确地承重20磅，并且有5个可以放入的数据项，他们的重量一次为
 *  11磅，8磅，7磅，6磅和5磅。
 *
 *  1.选中一个数 （小于背包重量)
 *  2.在剩下的数中 找出小于 背包剩余的重量的数（再回到1），如果等于就结束。
 *  3.没有找到的话，放弃选中的一个数 （回到1）
 */
public class Pack {
    static int[] items = {11,8,7,6,5};
    static int pack = 20;
    static ArrayList<Integer> pickItems = new ArrayList<>();
    static int index = 0;
//
//    public boolean fillPack(int index,int total,int[] leftItems){
//        int num = items[index++];
//        int left = total - num;
//        if (total == 0) {
//            return true;
//        }else {
//            //items 去掉
//            boolean isChooseRight = fillPack(index,left,{!num});
//            if (!isChooseRight){
//                fillPack(--index,total,{!num});
//                return false;
//            }
//        }
//    }

    public int chooseItem(int index){
        return 0;
    }
    public int findSmallItem(){
        return 0;
    }
}
