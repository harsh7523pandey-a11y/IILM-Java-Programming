class Solution {
    public String makeGood(String s) {
        StringBuilder stk = new StringBuilder();

        for (char c : s.toCharArray()) {
            int n = stk.length();

            if (n > 0 && Math.abs(stk.charAt(n - 1) - c) == 32) {
                stk.deleteCharAt(n - 1);
            } else {
                stk.append(c);
            }
        }

        return stk.toString();
    }
}