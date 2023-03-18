import java.util.HashSet;

// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]==nums[j]){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }
// Upward Apporach is brute force On2

// ideas we can sort as well Onlogn

// We can use Hashset time On Space On

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet=new HashSet<>();

        for(int n:nums){
            if(hashSet.contains(n)) return true;
            hashSet.add(n);
        }
        
        return false;
    }
}