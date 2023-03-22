import java.util.Arrays;

class Solution {
    public int maxArea(int[] height) {

        int[] heightTemp=height;
        Arrays.sort(heightTemp);
        int a=height[heightTemp.length-1];
        int b=height[heightTemp.length-2];

        int count=0;
        int temp=0;
        for(int i=0;i<height.length;i++){

            if(height[i]==a || height[i]==b){
               temp++; 
            }
            if(temp==1){
                count++;
            }
        }

        return b*count;
    }
}