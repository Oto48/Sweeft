package tasks;

import java.util.HashSet;

public class DataStructure {
    private HashSet<Integer> set = new HashSet<Integer>();

    public boolean insert(int x) {
        return set.add(x);
    }

    public boolean remove (int x) {
        return set.remove(x);
    }

    public boolean search( int x) {
        return set.contains(x);
    }

    public int getRandom() {
        int key = (int)(Math.random()*set.size());
        Integer[] nums = toArray();
        return nums[key];
    }

    public Integer[] toArray(){
        Integer[] nums = new Integer[set.size()];
        set.toArray(nums);
        return nums;
    }

    public int size(){
        return set.size();
    }
}
