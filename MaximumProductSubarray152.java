import java.util.Arrays;

class Solution {
    public int maxProduct(int[] nums) {
        
        int[] tempNums=nums;
        Arrays.sort(tempNums);
        int result = tempNums[tempNums.length-1];
        int currentMax =1;
        int currentMin = 1;
        for(int n :nums){
            if(n==0){
                currentMax=1;
                currentMin=1;
                continue;
            }
            int temp = currentMax*n;
            currentMax=Math.max(Math.max(n*currentMax, n*currentMin),n);
            currentMin=Math.min(Math.min(temp, n*currentMin),n);
            result=Math.max(result,currentMax);
        }
        return result;
    }
}