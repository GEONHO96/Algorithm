class Solution {
    public int solution(String myString, String pat) {
        int count = 0;
        int index = myString.indexOf(pat);
        while (index != -1) {
            count++;
            index = myString.indexOf(pat, index + 1);
        }
        return count;
    }
}