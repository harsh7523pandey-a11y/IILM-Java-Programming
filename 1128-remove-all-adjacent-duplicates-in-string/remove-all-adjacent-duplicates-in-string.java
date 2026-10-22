class Solution {
    public String removeDuplicates(String s) {
        StringBuilder stk = new StringBuilder();
        for (char c : s.toCharArray()) {
            int n = stk.length();
            if (n > 0 && stk.charAt(n - 1) == c) {
                stk.deleteCharAt(n - 1);
            } else {
                stk.append(c);
            }
        }
        return stk.toString();
    }
}