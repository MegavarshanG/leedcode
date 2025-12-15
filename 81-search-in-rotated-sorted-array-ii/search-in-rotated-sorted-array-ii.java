class Solution {
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        int str=0;
        int end =nums.length-1;
        while(str<=end){
            int  mid=str+(end-str)/2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                str=mid+1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}