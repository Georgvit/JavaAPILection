package houmvork.lesson.six;

import java.util.TreeMap;

public class ArraySet {

    TreeMap<Integer, Integer> arrMap = new TreeMap<>();

    public  void add (Integer num){
        arrMap.put(num, 1);
    }

    public void printArr(){
        for (Integer key: arrMap.keySet()) {
            System.out.print(key + " ");
        }
    }

}
