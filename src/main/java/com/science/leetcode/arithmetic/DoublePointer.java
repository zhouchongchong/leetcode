package com.science.leetcode.arithmetic;

import com.science.leetcode.model.ListNode;

public class DoublePointer {
//    合并两个链表
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1), p = dummy;
        ListNode p1 = list1, p2 = list2;

        while (p1 != null && p2 != null) {
            if (p1.val < p2.val){
                p.next = p1;
                p1 = p1.next;
            } else {
                p.next = p2;
                p2 =p2.next;
            }
            p = p.next;
        }

        if (p1 ==null)
            p.next = p2;

        if (p2 == null)
            p.next = p1;

        return dummy.next;
    }

    //    合并两个链表
    public static ListNode partition(ListNode head,int x) {
        ListNode p1 = new ListNode(-1),p2 = new ListNode(-1),p1h = p1, p2h = p2;
        ListNode lastP1 = null;
        while (head != null) {
            if (head.val < x){
                p1.next = head;
                p1 = p1.next;
            } else  {
                p2.next = head;
                p2 = p2.next;
            }
            head = head.next;
        }
        p2.next = null;
        p1.next = p2h.next;
        return p1h.next;
    }

    public static ListNode mergeKLists(ListNode[] lists) {

        return mergeList(lists, 0, lists.length - 1);
    }

    public static ListNode mergeList(ListNode[] list,int l, int r){
        if (l > r)
            return null;

        if (l == r)
            return  list[l];
        int mid = (l + r) >> 1;
        return mergeTwoLists(mergeList(list, l , mid), mergeList(list, mid + 1, r));
    }

    public static ListNode findFromEnd(ListNode list, int k) {
        ListNode r = list;
        for (int i = 0; i < k; i ++ ){
            r = r.next;
        }

        ListNode p = list;
        while (r != null) {
            p = p.next;
            r = r.next;
        }

        return p;
    }

    // 主函数
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 虚拟头结点
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        // 删除倒数第 n 个，要先找倒数第 n + 1 个节点
        ListNode x = findFromEnd(dummy, n + 1);
        // 删掉倒数第 n 个节点
        x.next = x.next.next;
        return dummy.next;
    }
}

