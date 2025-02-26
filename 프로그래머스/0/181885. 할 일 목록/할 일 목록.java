class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int len = todo_list.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (!finished[i]) {
                count++;
            }
        }
        String[] answer = new String[count];
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (!finished[i]) {
                answer[index] = todo_list[i];
                index++;
            }
        }
        return answer;
    }
}