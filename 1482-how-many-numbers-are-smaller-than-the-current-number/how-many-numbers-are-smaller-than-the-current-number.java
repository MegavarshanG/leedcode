class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count =new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            int a=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    a++;
                }  
            }count[i]=a;
        }return count;
    }
}