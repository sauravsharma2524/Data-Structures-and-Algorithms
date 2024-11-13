class Solution {
    public boolean isAnagram(String s, String t) {

         int[] count = new int[26];

        // Increment counts for each character in 's'
        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }

        // Decrement counts for each character in 't'
        for (char ch : t.toCharArray()) {
            count[ch - 'a']--;
        }

        // Check if all counts are zero
        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }

        return true;
        
    }
}