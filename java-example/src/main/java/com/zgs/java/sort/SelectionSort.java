package com.zgs.java.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * 选择排序
 * 原理
 * 1.第一次遍历数组里查询最小值，和起始位置元素调换，
 * 交换元素 数组里最小元素在首位，
 * 2.第二次遍历数组从第二位开始（首位已经是最小值），再次查询剩下元素里最小值，和遍历起始位置调换，
 * 交换元素 数组里第二小元素放在第二位，
 * 以此类推
 * 时间复杂度 O(n^2)
 * 不稳定的排序方法
 *
 * @author zhengenshen
 * @date 2018-12-03 14:20
 */
public class SelectionSort {

    public static void main(String[] args) {
        Random random = new Random();

        int[] data = new int[10];

        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(100);
        }

        System.out.println("待排序数组");
        System.out.println(Arrays.toString(data));

        for (int i = 0; i < data.length; i++) {
            int minIndex = i;
            //查找最小的元素的索引
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }
            //交换最小的元素和当前位置的元素，当然这里可以加入一个最小元素是否是当前位置元素的判断来较少交换次数
            int temp = data[i];
            data[i] = data[minIndex];
            data[minIndex] = temp;
        }

        System.out.println("选择排序后数组");
        System.out.println(Arrays.toString(data));
    }
}
