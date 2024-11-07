class Solution {
    public int solution(int[] numbers) {
        int first = 0;
        int second = 0;
        int max = 0;
        int next = 0;
        int cnt = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == max) {
                cnt++;
                first = numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == max && cnt == 1) { 
                continue;
            }            
            if (numbers[i] > next) {
                next = numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == next) {
                second = next;
            }
        }        
        int answer = first * second;
        return answer;
    }
}