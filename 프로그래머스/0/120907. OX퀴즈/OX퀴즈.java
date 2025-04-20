class Solution {
    public String[] solution(String[] quiz) {
        int n = quiz.length;
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) { 
            String[] parts = quiz[i].split(" ");
            int a = Integer.parseInt(parts[0]);
            String op = parts[1];
            int b = Integer.parseInt(parts[2]);
            int c = Integer.parseInt(parts[4]);
            if (op.equals("+")) {
                if (a + b == c) ans[i] = "O";
                else ans[i] = "X";
            }
            else if (op.equals("-")) {
                if (a - b == c) ans[i] = "O";
                else ans[i] = "X";
            } else {
                break;
            }
        }
        return ans;
    }
}