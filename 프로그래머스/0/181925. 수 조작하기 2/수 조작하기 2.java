class Solution {
    public String solution(int[] numLog) {
        int n = numLog.length;
        String S = "";
        for (int i = 0; i < n - 1; i++) {
            if (numLog[i + 1] - numLog[i] == 1) S += "w";
            else if (numLog[i + 1] - numLog[i] == -1) S += "s";
            else if (numLog[i + 1] - numLog[i] == 10) S += "d";
            else if (numLog[i + 1] - numLog[i] == -10) S += "a";
        }
        return S;
    }
}