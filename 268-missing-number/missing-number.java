class Solution {
    public int missingNumber(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:nums){
            list.add(i);
        }
        Collections.sort(list);
        int i=0;
        for(int a:list){
            if(i!=a){
                return i;
            }
            i++;
        }
        return i;
    }
}