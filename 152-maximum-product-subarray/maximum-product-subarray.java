class Solution {
    public int maxProduct(int[] nums) {

        // initializing variables
        int ans = nums[0];
        int leftProduct = 1;
        int rightProduct = 1;

        for (int i = 0 ; i < nums.length; i++){

            // checking if the value of i == 0 

            leftProduct = leftProduct == 0 ? 1 : leftProduct;
            rightProduct = rightProduct == 0 ? 1 : rightProduct;

            // left Product
            leftProduct *= nums[i];

            // rightProduct
            rightProduct *= nums[nums.length-1-i];

            ans = Math.max(ans , Math.max(leftProduct,rightProduct));

        }
        return ans;

        
    }
}