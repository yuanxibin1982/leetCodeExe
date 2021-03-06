package org.example.leetcode.simple;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * Author yuanxibin
 * CreatDate 2020/12/13 09:45
 * 类作用说明：
 * 给你一个由不同字符组成的字符串 allowed 和一个字符串数组 words 。如果一个字符串的每一个字符都在 allowed 中，就称这个字符串是 一致 字符串。
 *
 * 请你返回 words 数组中 一致 字符串的数目。
 *
 * 示例 1：
 *
 * 输入：allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
 * 输出：2
 * 解释：字符串 "aaab" 和 "baa" 都是一致字符串，因为它们只包含字符 'a' 和 'b' 。
 *
 * 示例 2：
 *
 * 输入：allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
 * 输出：7
 * 解释：所有字符串都是一致的。
 *
 * 示例 3：
 *
 * 输入：allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
 * 输出：4
 * 解释：字符串 "cc"，"acd"，"ac" 和 "d" 是一致字符串。
 *
 * 提示：
 *
 *     1 <= words.length <= 104
 *     1 <= allowed.length <= 26
 *     1 <= words[i].length <= 10
 *     allowed 中的字符 互不相同 。
 *     words[i] 和 allowed 只包含小写英文字母。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/count-the-number-of-consistent-strings
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * */

public class Exe5609 {

    public static int countConsistentStrings(String allowed, String[] words) {
        Set allowedSet = new HashSet();
        char[] chars = allowed.toLowerCase(Locale.ROOT).toCharArray();
        for (char c : chars) {
            allowedSet.add(c);
        }
        int i = 0;
        for (String word : words) {
         char[] wordArr = word.toLowerCase(Locale.ROOT).toCharArray();
         Set wordSet = new HashSet();
            for (char c : wordArr) {
                wordSet.add(c);
            }
            if (allowedSet.containsAll(wordSet)) {
                i++;
            }
        }
        return i;
    }

    @Test
    public void test1() {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        System.out.println(countConsistentStrings(allowed, words));
    }
}
