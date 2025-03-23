class Solution {
    public int solution(int[] arr) {
        int len = arr.length;
        int answer = 1;
        for (int i = 0; i < len; i++) {
            answer = lcm(answer, arr[i]);
        }
        return answer;
    }
    public int gcd(int a, int b) {
        int temp;
        while (b > 0) {
            temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }
    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}