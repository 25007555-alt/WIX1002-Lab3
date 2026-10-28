#include <vector>
using namespace std;

// WIX1002 Task 3: Valid Boomerang (LeetCode 1037)
// Student: GENGHONGBO | Matric: 25007555
class Solution {
public:
    bool isBoomerang(vector<vector<int>>& points) {
        const long long x1 = points[1][0] - points[0][0];
        const long long y1 = points[1][1] - points[0][1];
        const long long x2 = points[2][0] - points[0][0];
        const long long y2 = points[2][1] - points[0][1];

        // A non-zero determinant means the three points are not collinear.
        return x1 * y2 - y1 * x2 != 0;
    }
};
