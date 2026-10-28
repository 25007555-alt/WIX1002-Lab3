// WIX1002 Task 3: Valid Boomerang (LeetCode 1037)
// Student: GENGHONGBO | Matric: 25007555
class Solution {
    public boolean isBoomerang(int[][] points) {
        long x1 = (long) points[1][0] - points[0][0];
        long y1 = (long) points[1][1] - points[0][1];
        long x2 = (long) points[2][0] - points[0][0];
        long y2 = (long) points[2][1] - points[0][1];

        // A non-zero determinant means the three points are not collinear.
        return x1 * y2 - y1 * x2 != 0;
    }
}
