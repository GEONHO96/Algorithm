class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] input = binomial.split(" ");
        int a = Integer.parseInt(input[0]);
        String op = input[1];
        int b = Integer.parseInt(input[2]);
        switch (op) {
            case "+":
                answer = a + b;
                break;
            case "-":
                answer = a - b;
                break;
            case "*":
                answer = a * b;
                break;
        }
        return answer;
    }
}