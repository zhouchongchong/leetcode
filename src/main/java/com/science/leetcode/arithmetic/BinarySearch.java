package com.science.leetcode.arithmetic;

public class BinarySearch {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // do binary search for shorter length array, make sure time complexity log(min(m,n)).
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int m = nums1.length;
        int n = nums2.length;
        int lo = 0;
        int hi = m;
        while (lo <= hi) {
            // partition A position i
            int i = lo + (hi - lo) / 2;
            // partition B position j
            int j = (m + n + 1) / 2 - i;

            int maxLeftA = i == 0 ? Integer.MIN_VALUE : nums1[i - 1];
            int minRightA = i == m ? Integer.MAX_VALUE : nums1[i];

            int maxLeftB = j == 0 ? Integer.MIN_VALUE : nums2[j - 1];
            int minRightB = j == n ? Integer.MAX_VALUE : nums2[j];

            if (maxLeftA <= minRightB && maxLeftB <= minRightA) {
                // total length is even
                if ((m + n) % 2 == 0) {
                    return (double) (Math.max(maxLeftA, maxLeftB) + Math.min(minRightA, minRightB)) / 2;
                } else {
                    // total length is odd
                    return (double) Math.max(maxLeftA, maxLeftB);
                }
            } else if (maxLeftA > minRightB) {
                // binary search left half
                hi = i - 1;
            } else {
                // binary search right half
                lo = i + 1;
            }
        }
        return 0.0;
    }
}
