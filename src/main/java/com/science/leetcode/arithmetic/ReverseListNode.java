package com.science.leetcode.arithmetic;

import com.science.leetcode.model.ListNode;

public class ReverseListNode {
    public static ListNode reverse(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        ListNode last = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }
    static ListNode postNode = null;
    public static ListNode reverseK(ListNode head, int k){
        if (k == 1){
           postNode = head.next;
           return head;
        }
        ListNode last = reverseK(head.next, k - 1);
        head.next.next = head;
        head.next = postNode;
        return last;
    }

    public static ListNode reverseLR(ListNode head, int l, int r){
        ListNode b = head;
        ListNode c = b;
        for (int i = 0; i < l; i++) {
            c = b;
            b = b.next;
        }
        ListNode listNode = reverseK(b, r - l);
        c.next = listNode;

        return head;
    }
    public static ListNode reverseFor(ListNode head){
        ListNode l = null, r = head, next = null;

        while (r != null){
            next = r.next;
            r.next = l;
            l = r;
            r = next;
        }
        return l;
    }
}
