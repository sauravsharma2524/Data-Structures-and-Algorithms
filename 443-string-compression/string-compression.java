class Solution {
    public int compress(char[] chars) {

        int  n = chars.length;
        if (n == 1){
            return 1;
        }

        int j=0, i=0;

        while (i < n){
           int count = 1;
           while(i < n-1 && chars[i] == chars[i+1]){
            i++;
            count++;
           }
           chars[j++] = chars[i++];
           if (count > 1) {
            for (char c : String.valueOf(count).toCharArray()){
                chars[j++] = c;
            }
           }
        }

        return j;
    }
}