class Solution {
    public String solution(String letter) {
        StringBuilder sb = new StringBuilder();
        String[] input = letter.split(" ");
        String[] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        int len1 = input.length;
        int len2 = morseCode.length;
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (input[i].equals(morseCode[j])) sb.append((char)('a' + j));
            }
        }
        return sb.toString();
    }
}