package com.science.leetcode;

import com.science.leetcode.arithmetic.BinarySearch;
import com.science.leetcode.arithmetic.DoublePointer;
import com.science.leetcode.arithmetic.SlidingWindow;
import com.science.leetcode.model.ListNode;
import org.junit.jupiter.api.Test;


public class BaseTest {
    @Test
    void contextLoads() {
        System.out.println("begin");
        int ret = SlidingWindow.lengthOfLongestSubstring2("abcabcaa");
        System.out.println(ret);
        System.out.println("end");
    }

    @Test
    void testFindMedianSortedArrays() {
        System.out.println("begin");
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {7,8,9};
        double ret = BinarySearch.findMedianSortedArrays(arr1, arr2);
        System.out.println(ret);
        System.out.println("end");
    }

    @Test
    void testMergeList() {
        System.out.println("begin");
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {7,8,9};
        ListNode l1 = new ListNode(1,new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1,new ListNode(3, new ListNode(4)));
        ListNode listNode = DoublePointer.mergeTwoLists(l1, l2);
        while (listNode != null){
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
        System.out.println("end");
    }

    @Test
    void testPartition() {
        System.out.println("begin");
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {7,8,9};
        ListNode l1 = new ListNode(1,new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(5,new ListNode(2))))));
        ListNode listNode = DoublePointer.partition(l1, 3);
        while (listNode != null){
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
        System.out.println("end");
    }

    @Test
    void testFindFromEnd() {
        System.out.println("begin");

        ListNode l1 = new ListNode(1,new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(5,new ListNode(2))))));
        ListNode listNode = DoublePointer.findFromEnd(l1, 2);
        System.out.println(listNode.val);
        System.out.println("end");
    }
}
