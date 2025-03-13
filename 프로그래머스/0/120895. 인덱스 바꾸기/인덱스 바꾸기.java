class Solution {
    public String solution(String my_string, int num1, int num2) {
        int len = my_string.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (0 <= i && i < num1) {
                sb.append(my_string.charAt(i));
            } else if (i == num1 || i == num2) {
                sb.append(my_string.charAt(num1 + num2 - i));
            } else {
                sb.append(my_string.charAt(i));
            } 
        }
        return sb.toString();
    }
}