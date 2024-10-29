package studyplan.twoPointer;

import java.util.Arrays;

// https://leetcode.com/problems/merge-sorted-array/?envType=problem-list-v2&envId=two-pointers&difficulty=EASY
public class Q88MergeSortedArray {

    public static void main(String [] args) {
        int[] nums1 = new int [] {1,2,3,0,0,0};
        merge(nums1, 3, new int [] {2,5,6}, 3);
        System.out.println(Arrays.toString(nums1));

        nums1 = new int [] {1};
        merge(nums1, 1, new int [] {}, 0);
        System.out.println(Arrays.toString(nums1));

        nums1 = new int [] {0};
        merge(nums1, 0, new int [] {1}, 1);
        System.out.println(Arrays.toString(nums1));
    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1.length != m + n || nums2.length != n) {
            return;
        }

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while(j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }
}
