class Solution {
    public String solution(String[] str_list, String ex) {
        int n = str_list.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (str_list[i].contains(ex)) continue;
            else sb.append(str_list[i]);
        }
        return sb.toString();
    }
}