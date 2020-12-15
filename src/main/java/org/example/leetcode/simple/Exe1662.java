package org.example.leetcode.simple;

import org.junit.jupiter.api.Test;

/**
 * Created by IntelliJ IDEA.
 * Author yuanxibin
 * CreatDate 2020/12/15 10:15
 * 类作用说明：
 * 给你两个字符串数组 word1 和 word2 。如果两个数组表示的字符串相同，返回 true ；否则，返回 false 。
 *
 * 数组表示的字符串 是由数组中的所有元素 按顺序 连接形成的字符串。
 *
 * 示例 1：
 *
 * 输入：word1 = ["ab", "c"], word2 = ["a", "bc"]
 * 输出：true
 * 解释：
 * word1 表示的字符串为 "ab" + "c" -> "abc"
 * word2 表示的字符串为 "a" + "bc" -> "abc"
 * 两个字符串相同，返回 true
 *
 * 示例 2：
 *
 * 输入：word1 = ["a", "cb"], word2 = ["ab", "c"]
 * 输出：false
 *
 * 示例 3：
 *
 * 输入：word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
 * 输出：true
 *
 * 提示：
 *
 *     1 <= word1.length, word2.length <= 103
 *     1 <= word1[i].length, word2[i].length <= 103
 *     1 <= sum(word1[i].length), sum(word2[i].length) <= 103
 *     word1[i] 和 word2[i] 由小写字母组成
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/check-if-two-string-arrays-are-equivalent
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class Exe1662 {

  public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    int length = word1.length > word2.length ? word1.length : word2.length;
    StringBuilder stringBuilder1 = new StringBuilder();
    StringBuilder stringBuilder2 = new StringBuilder();
    for (int i = 0; i < length; i++) {
      if (i < word1.length) {
        stringBuilder1.append(word1[i]);
      }
      if (i < word2.length) {
        stringBuilder2.append(word2[i]);
      }
    }
    if (stringBuilder1.length() != stringBuilder2.length()) {
      return false;
    } else {
      if (stringBuilder1.toString().equals(stringBuilder2.toString())) {
        return true;
      } else {
        return false;
      }
    }
  }

  public static boolean arrayStringsAreEqual1(String[] word1, String[] word2) {
    int length = word1.length > word2.length ? word1.length : word2.length;
    StringBuilder stringBuilder1 = new StringBuilder();
    StringBuilder stringBuilder2 = new StringBuilder();
    for (int i = 0; i < length; i++) {
      if (i < word1.length) {
        stringBuilder1.append(word1[i]);
      }
      if (i < word2.length) {
        stringBuilder2.append(word2[i]);
      }
    }
    return stringBuilder1.toString().equals(stringBuilder2.toString());
  }

  public static boolean arrayStringsAreEqual2(String[] word1, String[] word2) {
    StringBuilder stringBuilder1 = new StringBuilder();
    StringBuilder stringBuilder2 = new StringBuilder();
    for (String s : word1) {
      stringBuilder1.append(s);
    }
    for (String s : word2) {
      stringBuilder2.append(s);
    }
    return stringBuilder1.toString().equals(stringBuilder2.toString());
  }

  @Test
  public void test1() {
    String[] word1  = {"abc", "d", "defg"};
    String[] word2 = {"abcddefg"};
    System.out.println(arrayStringsAreEqual(word1, word2));
  }

}
