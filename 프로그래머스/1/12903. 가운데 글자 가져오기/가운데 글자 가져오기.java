class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        if (len % 2 == 1) {
            sb.append(s.charAt(len / 2));
        } else {
            sb.append(s.substring(len / 2 - 1, len / 2 + 1));
        }
        return sb.toString();
    }
}