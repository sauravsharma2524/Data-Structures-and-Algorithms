class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int[] output = new int[nums1.length];
        int k = 0;
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length){
                if (nums1[i] == nums2[j]){
                    output[k] = nums1[i];
                   i++;
                   j++;
                    k++;
                } 
                else if (nums1[i]<nums2[j]){
                    i++;
                }
                else {
                    j++;
                }
        }  
        return Arrays.copyOfRange(output, 0, k);
    }
}