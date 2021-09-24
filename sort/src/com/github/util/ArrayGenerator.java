package com.github.util;

import java.util.Random;

/**
 * <h1>数组生成工具</h1>
 * @author lin hao
 * @create 2021/9/15
 */
public class ArrayGenerator {
    private ArrayGenerator() {}

    /**
     * <h2>随机生成数组</h2>
     * @param n 数组元素个数
     */
    public static Integer[] generateOrderedArray(int n) {
        Integer[] array = new Integer[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }
        return array;
    }
    /**
     * <h2>随机生成数组</h2>
     * @param n 数组元素个数
     * @param bound 数组元素上限（不包含）
     */
    public static Integer[] generateOrderedArray(int n, int bound) {
        Integer[] array = new Integer[n];
        Random random = new Random(bound);
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(bound);
        }
        return array;
    }
}
