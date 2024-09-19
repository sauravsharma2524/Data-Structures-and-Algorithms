class Solution {
    public boolean check(int[] nums) {
        int peaks = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > nums[(i+1)%nums.length]){
                peaks++;
            }
        }
        if(peaks > 1){
            return false;
        }
        return true;
    }
}