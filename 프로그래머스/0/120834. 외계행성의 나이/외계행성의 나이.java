class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        String S = String.valueOf(age);
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (ch == '0') sb.append('a');
            if (ch == '1') sb.append('b');
            if (ch == '2') sb.append('c');
            if (ch == '3') sb.append('d');
            if (ch == '4') sb.append('e');
            if (ch == '5') sb.append('f');
            if (ch == '6') sb.append('g');
            if (ch == '7') sb.append('h');
            if (ch == '8') sb.append('i');
            if (ch == '9') sb.append('j');
        }
        return sb.toString();
    }
}