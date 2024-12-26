package SelectionSort;

import java.util.ArrayList;
import java.util.List;

public class MySelectionSort {
    private Integer findSmallest(List<Integer> list) {
        Integer smallest = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (smallest > list.get(i)) {
                smallest = list.get(i);
            }
        }
        return smallest;
    }

    public List<Integer> selectionSort(List<Integer> list) {
        List<Integer> sortedList = new ArrayList<>();
        int size= list.size();
        for (int i = 0; i < size; i++) {
            Integer smallest = findSmallest(list);
            sortedList.add(smallest);
            list.remove(smallest);
        }
        return sortedList;
    }

    public static void main(String[] args) {
        MySelectionSort mySelectionSort = new MySelectionSort();
        List<Integer> myList = new ArrayList<>();
        myList.add(9);
        myList.add(10);
        myList.add(1);
        myList.add(0);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(2);
        myList.add(7);
        myList.add(6);
        myList.add(8);
        System.out.println(mySelectionSort.selectionSort(myList));
    }
}
