class Solution {
    public int compress(char[] chars) {
        int index = 0;
        int i = 0;
        while (i < chars.length) {   
            char ch = chars[i];
            int count = 0;
            // Same character kitni baar aa raha hai
            while (i < chars.length && chars[i] == ch) {
                count++;
                i++;
            }
            // Character store karo
            chars[index] = ch;
            index++;
            // Agar count 1 se zyada hai
            if (count > 1) {
                String num = String.valueOf(count);
                for (int j = 0; j < num.length(); j++) {
                    chars[index] = num.charAt(j);
                    index++;
                }
            }
        }
        return index;
    }
}
