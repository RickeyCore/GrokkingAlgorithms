package BinarySearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BinarySearch {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        list.add(50);
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(100));
        }
        list.sort(Integer::compare);
        System.out.println(list);
        System.out.println(BinarySearch.myBinarySearch(list,1));
    }

    static Integer myBinarySearch(List<Integer> list, Integer item) {
        int low = 0;
        int high = list.size() - 1;
        while (low <= high) {
            int mid = (high + low)/2;
            int guess = list.get(mid);
            if (guess == item) {
                return mid;
            }
            else if(guess> item){
                high= mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
}


