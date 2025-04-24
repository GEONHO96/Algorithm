class Solution {
    public long solution(int price, int money, int count) {
        long k = price;
        long newPrice = 0;
        for (int i = 1; i <= count; i++) {
            newPrice += i * k;
        }
        long lackPrice = newPrice - money;
        if (lackPrice <= 0) return 0;
        else return lackPrice;
    }
}