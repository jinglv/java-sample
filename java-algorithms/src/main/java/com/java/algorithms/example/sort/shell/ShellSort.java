package com.java.algorithms.example.sort.shell;

/**
 * 希尔排序（插入排序的高级版）
 * 希尔排序(Shell's Sort)是插⼊排序的⼀种⼜称“缩⼩增量排序”（ Diminishing Increment Sort），是直接插⼊排序算法的⼀种更⾼效的改进版本。希尔排序是⾮稳定排序算法。该⽅法因D.L.Shell
 * 于1959年提出⽽得名
 * <p>
 * 就是把数列进⾏分组(不停使⽤插⼊排序)，直⾄从宏观上看起来有序，最后插⼊排序起来就容易了(⽆须多次移位或交换)
 *
 * @author jingLv
 * @date 2020-04-09 3:43 PM
 */
public class ShellSort {

    public static int[] shellSort(int[] arr) {
        // 获取数组的长度
        int l = arr.length;

        //增量每次都是 数组长度/2
        for (int step = l / 2; step > 0; step /= 2) {
            //从增量那组开始进⾏插⼊排序，直⾄完毕
            for (int i = step; i < l; i++) {
                int j = i;
                int temp = arr[j];
                // j - step 就是代表与它同组隔壁的元素
                while (j - step >= 0 && arr[j - step] > temp) {
                    arr[j] = arr[j - step];
                    j = j - step;
                }
                arr[j] = temp;
            }
        }
        return arr;
    }
}
