import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stk = new Stack<>();
        for (String op : operations) {
            if (op.equals("C")) {
                stk.pop();
            } else if (op.equals("D")) {
                stk.push(stk.peek() * 2);
            } else if (op.equals("+")) {
                int last = stk.pop();
                int secondLast = stk.peek();
                stk.push(last);
                stk.push(last + secondLast);
            } else {
                stk.push(Integer.parseInt(op));
            }
        }
        int sum = 0;
        for (int score : stk) {
            sum += score;
        }
        return sum;
    }
}