package com.github.sort;

/**
 * <h1>排序接口<h1/>
 * <p>  This interface is sortable according to the objects of
 * each class that implements it </p>
 * @author lin hao
 * @create 2021/9/15
 */
public interface Sortable {

    /**
     * <h2>升序排序<h2>
     *
     * @param <E>  A generic array that can be compared 可进行比较的泛型数组
     */
    <E extends Comparable<E>> void sortByAsc(E[] array);

    /**
     * <h2>交换数组元素</h2>
     *
     * @param <E> 数组
     * @param i   数组元素位置1
     * @param j   数组元素位置2
     */
    static <E> void swap(E[] array, int i, int j) {
        E temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
