import java.util.*;
class Solution {
    public boolean search(int[] nums, int target) {
        int i=-1;
        ArrayList<Integer> list=new ArrayList<>();
        for(int a:nums){
            list.add(a);
        }
        Collections.sort(list);
        i=Collections.binarySearch(list,target);
        if(i>=0){
            return true;
        }
        return false;
    }
}