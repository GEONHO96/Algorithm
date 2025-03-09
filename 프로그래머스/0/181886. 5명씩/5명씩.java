class Solution {
    public String[] solution(String[] names) {
        String[] answer = {};
        int len = names.length;
        if (len % 5 == 0) {
            answer = new String[len / 5];
            for (int i = 0; i < len / 5; i++) {
                answer[i] = names[5 * i];
            }
        } else {
            answer = new String[len / 5 + 1];
            for (int i = 0; i < len / 5 + 1; i++) {
                answer[i] = names[5 * i];
            }
        }
        return answer;
    }
}