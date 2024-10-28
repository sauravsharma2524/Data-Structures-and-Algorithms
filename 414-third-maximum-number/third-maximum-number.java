class Solution {
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (final int num : nums){
            if (first < num){
                third = second;
                second = first;
                first = num;
            }
            else if (first > num && num > second){
                third = second;
                second = num;
            }
            else if (second > num && num > third){
                third = num;
            }
        }
        return third == Long.MIN_VALUE ? (int) first : (int) third;
    }
}