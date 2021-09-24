package com.github.sort;

/**
 * <h1>选择排序<h1/>
 * @author lin hao
 * @create 2021/9/14
 */
public class SelectionSort implements Sortable {

    @Override
    public <E extends Comparable<E>> void sortByAsc(E[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            Sortable.swap(array, i, minIndex);
        }
    }
//
//    public <E extends Comparable<E>> void sort2(E[] array) {
//        for (int i = array.length - 1; i >= 0; i--) {
//            int maxIndex = i;
//            for (int j = i - 1; j >= 0; j--) {
//                if (array[j].compareTo(array[maxIndex]) < 0) {
//                    maxIndex = j;
//                }
//            }
//            swap(array, i, maxIndex);
//        }
//    }



}
