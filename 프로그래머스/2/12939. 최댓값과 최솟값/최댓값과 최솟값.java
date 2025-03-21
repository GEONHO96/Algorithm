import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] input = s.split(" ");
        int len = input.length;
        int[] numbers = new int[len];
        for (int i = 0; i < len; i++) {
            numbers[i] = Integer.parseInt(String.valueOf(input[i]));
        }
        Arrays.sort(numbers);
        String answer = String.valueOf(numbers[0] + " " + numbers[len - 1]);
        return answer;
    }
}