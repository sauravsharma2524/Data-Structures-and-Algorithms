class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
       int cand = 0, count = 0;
       for(int i = 0; i < n; i++ ){
        if (count == 0){
            cand = nums[i];
        }
        if (cand == nums[i] ){
            count++;
        }
        else{
            count--;
        }
       } 
       return cand;     
    }
}