class Solution {
    public int solution(String myString, String pat) {
        int ans = 0;
        int n = myString.length();
        String newMyString = "";
        for (int i = 0; i < n; i++) {
            if (myString.charAt(i) == 'A') newMyString += 'B';
            else newMyString += 'A';
        }
        if (newMyString.contains(pat)) ans = 1;
        return ans;
    }
}