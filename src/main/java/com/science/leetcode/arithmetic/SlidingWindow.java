package com.science.leetcode.arithmetic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SlidingWindow {
    // 最大无重复连续子串
    public static int lengthOfLongestSubstring(String s) {
        int ret = 0,start = 0;
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> windows = new HashMap();
        for (int idx = 0; idx < chars.length; idx++) {
            char aChar = chars[idx];
            if (windows.containsKey(aChar)) {
                start = Math.max(start, windows.get(aChar) + 1);
            }
            windows.put(aChar, idx);
            ret = Math.max(ret, idx - start +1);
        }
        return ret;
    }

    public static int lengthOfLongestSubstring2(String s) {
        // 哈希集合，记录每个字符是否出现过
        Set<Character> occ = new HashSet<Character>();
        int n = s.length();
        // 右指针，初始值为 -1，相当于我们在字符串的左边界的左侧，还没有开始移动
        int rk = -1, ans = 0;
        for (int i = 0; i < n; ++i) {
            System.out.println("i = " + i);
            if (i != 0) {
                // 左指针向右移动一格，移除一个字符
                occ.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                // 不断地移动右指针
                System.out.println("k = " + rk);

                occ.add(s.charAt(rk + 1));
                ++rk;
            }
            // 第 i 到 rk 个字符是一个极长的无重复字符子串
            ans = Math.max(ans, rk - i + 1);
        }
        return ans;
    }
}
