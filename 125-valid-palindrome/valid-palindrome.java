class Solution {
    public boolean isPalindrome(String s) {
        String str = "";

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                str = str + Character.toLowerCase(c);
            }
        }

        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
