class Solution {
    public String[] solution(String[] strArr) {
        int len1 = strArr.length;
        String[] answer = new String[len1];
        for (int i = 0; i < len1; i++) {
            answer[i] = "";
            int len2 = strArr[i].length();
            if (i % 2 == 0) {
                for (int j = 0; j < len2; j++) {
                    answer[i] += Character.toLowerCase(strArr[i].charAt(j));
                }
            }  else {
                for (int j = 0; j < len2; j++) {
                    answer[i] += Character.toUpperCase(strArr[i].charAt(j));
                }
            }
        }
        return answer;
    }
}