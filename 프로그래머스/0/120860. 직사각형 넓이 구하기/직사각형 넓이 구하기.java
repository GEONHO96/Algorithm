class Solution {
    public int solution(int[][] dots) {
        int minX = 256, minY = 256, maxX = -256, maxY = -256;
        int len = dots.length;
        for (int i = 0; i < len; i++) {
            minX = Math.min(minX, dots[i][0]);
            minY = Math.min(minY, dots[i][1]);
            maxX = Math.max(maxX, dots[i][0]);
            maxY = Math.max(maxY, dots[i][1]);
        }
        int area = (maxX - minX) * (maxY - minY);
        return area;
    }
}