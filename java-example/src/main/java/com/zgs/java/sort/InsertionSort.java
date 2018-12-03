package com.zgs.java.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * 插入排序
 * 在起始位置右侧（或左侧）找出最小的那个元素，然后和起始位置的元素交换。
 *
 * @author zhengenshen
 * @date 2018-12-03 15:04
 */
public class InsertionSort {

    public static void main(String[] args) {

        Random random = new Random();

        int[] data = new int[10];

        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(100);
        }

        System.out.println("待排序数组");
        System.out.println(Arrays.toString(data));

        for (int i = 1; i < data.length; i++) {
            //此处可以直接从第二个元素开始
            for (int j = i; j > 0; j--) {
                if (data[j] < data[j - 1]) {
                    //异或法 交换两个变量，不用临时变量
                    data[j] = data[j] ^ data[j - 1];
                    data[j - 1] = data[j] ^ data[j - 1];
                    data[j] = data[j] ^ data[j - 1];
                }
            }
        }

        System.out.println("插入排序后数组");
        System.out.println(Arrays.toString(data));
    }
}
