package com.github.sort;

/**
 * @author lin hao
 * @create 2021/9/15
 */
public class InsertionSort implements Sortable {

    @Override
    public <E extends Comparable<E>> void sortByAsc(E[] array) {
        for (int i = 1; i < array.length; i++) {
            E temp = array[i];
            int j = i;
            for (; j >= 1 && temp.compareTo(array[j - 1]) < 0; j--) {
                array[j] = array[j - 1];
            }
            array[j] = temp;
        }
    }
}
