package com.github.hcsp.collection;

import java.util.LinkedList;
import java.util.List;

public class RemoveDuplicateCharsInString {
    // 修改这个方法使得它能够输出正确结果：
    // 例如，输入aabbcc返回abc
    // 输入ccbbaa返回cba
    // 输入apple返回aple
    public static String removeDuplicateCharsInString(String s) {
        List<Character> charSet = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!charSet.contains(ch)) {
                charSet.add(ch);
            }
        }

        String result = "";
        for (Character ch : charSet) {
            result += ch;
        }

        return result;
    }
}
