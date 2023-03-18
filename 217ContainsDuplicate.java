class Solution {
    public boolean containsDuplicate(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i;j<nums.length-1;j++){
                if(i==j){
                    return true;
                }
            }
        }
        return false;
    }
}