package cha6_recursion;

/**
 * 汉诺塔问题  最简单的 三个盘子  从 A塔座 移动到 C塔座, B塔座为中间塔座
 */
public class TowersApp {
    static int nDisks = 3;

    public static void main(String[] args) {
        doTowers(3,'A', 'B', 'C');
    }

    public static void doTowers(int topN, char from, char inter,char to){
        if (topN == 1){
            // 基值条件，只有一个盘子，直接移动就好了
            System.out.println("Disk 1 from " + from + " to " + to);
        }else {
            //将 n-1个盘子 移动到中间塔座
            doTowers(topN-1, from, to, inter);
            //将第n个盘子 移动到 最大的盘子移动到
            System.out.println("Disk " + topN + " from " + from + " to " + to);

            //继续将 子树从中间塔座移动到 目标塔座
            doTowers(topN-1, inter, from, to);
        }
    }
}
