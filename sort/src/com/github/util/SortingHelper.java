package com.github.util;

import com.github.sort.Sortable;

/**
 * <h1>排序助手</h1>
 *
 * @author lin hao
 * @create 2021/9/15
 */
public class SortingHelper {

    private SortingHelper() {}

    /**
     * <h2>是否是升序排序</h2>
     * @param <E> 泛型数组
     */
    public static <E extends Comparable<E>> boolean isSortedByAsc(E[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(array[i - 1]) < 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * <h2>是否是降序排序</h2>
     * @param <E> 泛型数组
     */
    public static <E extends Comparable<E>> boolean isSortedByDesc(E[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(array[i - 1]) > 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * <h2>执行排序算法</h2>
     */
    public static <E extends Comparable<E>> void run(Class<? extends Sortable> clazz,
                                                     E[] array)
            throws IllegalAccessException, InstantiationException {
        Sortable function = clazz.newInstance();
        long startTime = System.nanoTime();
        function.sortByAsc(array);
        double time = (System.nanoTime() - startTime) / (NumericHelper.BILLION * 1.0);
        System.out.println("length:" + array.length + " " + clazz.getSimpleName() + " takes: " + time + "s");
        if (!SortingHelper.isSortedByAsc(array)) {
            throw new RuntimeException("sorted failed");
        }
    }
}
