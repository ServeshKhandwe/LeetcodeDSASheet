import java.util.Arrays;

class Solution {
    public int maxProduct(int[] nums) {
        int product=0;
        int currentProduct=1;

        for(int i:nums){
            if(currentProduct<0) currentProduct=1;
            currentProduct*=i;
            product=Math.max(product, currentProduct);
        }
        return product;       
    }
}
