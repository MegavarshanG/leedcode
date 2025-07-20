class Solution {
    public List<Boolean> kidsWithCandies(int[] nums, int ext) {
        List<Boolean> arr=new ArrayList<>();
        int max=nums[0];
        for(int num:nums){
            if(max<=num){
                max=num;
            }
        }
        for(int a:nums){
                arr.add(a+ext>=max);
        }return arr;
    }  
}