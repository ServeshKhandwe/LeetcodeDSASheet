import java.util.Arrays;

class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices.length==0) return 0;

        int count=0;
        for(int i=0;i<prices.length;i++){
            if(prices[0]>prices[i]){
                count++;
            }
        }
        if(count==prices.length) return 0;
        
        

        
        return 0;
    }
}