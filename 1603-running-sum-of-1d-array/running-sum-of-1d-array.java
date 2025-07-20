class Solution {
    public int[] runningSum(int[] nums) {
        int[] sum=new int[nums.length];
        int a=0;
        for(int i=0;i<nums.length;i++){
            a+=nums[i];
            sum[i]=a;
        }return sum;
    }
}