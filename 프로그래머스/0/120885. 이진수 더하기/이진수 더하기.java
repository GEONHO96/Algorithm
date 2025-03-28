class Solution {
    public String solution(String bin1, String bin2) {
        int binaryToDecimalBin1 = Integer.parseInt(bin1, 2);
        int binaryToDecimalBin2 = Integer.parseInt(bin2, 2);
        int sum = binaryToDecimalBin1 + binaryToDecimalBin2;
        return Integer.toBinaryString(sum);
    }
}