class Solution {
    public int maxSubArray(int[] nums) {
        int maxArray=nums[0];
        int currentSum=0;
        for(int n:nums){
            if(currentSum<0) currentSum=0;
            currentSum+=n;
            maxArray=Math.max(maxArray,currentSum);
        }       
        return maxArray;
    }
}