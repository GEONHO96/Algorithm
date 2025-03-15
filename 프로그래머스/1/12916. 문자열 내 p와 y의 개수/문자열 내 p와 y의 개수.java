class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int len = s.length();
        int countP = 0;
        int countY = 0;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == 'p' || s.charAt(i) == 'P') countP++;
            if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') countY++;
        }
        if (countP != countY) answer = false;
        return answer;
    }
}