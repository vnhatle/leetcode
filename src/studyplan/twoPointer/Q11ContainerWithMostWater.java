package studyplan.twoPointer;

// https://leetcode.com/problems/container-with-most-water/description/?envType=problem-list-v2&envId=two-pointers
public class Q11ContainerWithMostWater {

    public static void main(String [] args) {
        System.out.println(maxAreaBruteforce(new int[] {1,8,6,2,5,4,8,3,7}));
        System.out.println(maxAreaBruteforce(new int[] {1,1}));
        System.out.println(maxAreaBruteforce(new int[] {8,7,2,1}));

        System.out.println(maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
        System.out.println(maxArea(new int[] {1,1}));
        System.out.println(maxArea(new int[] {8,7,2,1}));
    }

    static int maxAreaBruteforce(int [] height) {
        if (height.length == 0) {
            return 0;
        }

        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                maxArea = Math.max(maxArea, (j - i) * Math.min(height[i], height[j]));
            }
        }
        return maxArea;
    }

    static int maxArea(int [] height) {
        if (height.length == 0) {
            return 0;
        }

        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            maxArea = Math.max(maxArea, (right - left) * Math.min(height[left], height[right]));

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
