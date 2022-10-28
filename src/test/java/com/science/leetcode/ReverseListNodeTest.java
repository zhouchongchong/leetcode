package com.science.leetcode;

import com.science.leetcode.arithmetic.DoublePointer;
import com.science.leetcode.arithmetic.ReverseListNode;
import com.science.leetcode.model.ListNode;
import org.junit.jupiter.api.Test;

public class ReverseListNodeTest {
    @Test
    void testFindFromEnd() {
        System.out.println("begin");

        ListNode l1 = new ListNode(1,new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5,new ListNode(6))))));
        ListNode listNode = ReverseListNode.reverseFor(l1);
        System.out.println(listNode.val);
        System.out.println("end");
    }

    @Test
    void testReverseK() {
        System.out.println("begin");
        ListNode l1 = new ListNode(1,new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5,new ListNode(6))))));
        ListNode listNode = ReverseListNode.reverseK(l1,3);
        System.out.println(listNode.val);
        System.out.println("end");
    }

    @Test
    void testReverseLR() {
        System.out.println("begin");
        ListNode l1 = new ListNode(1,new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5,new ListNode(6))))));
        ListNode listNode = ReverseListNode.reverseLR(l1,2,4);
        System.out.println(listNode.val);
        System.out.println("end");
    }
}
