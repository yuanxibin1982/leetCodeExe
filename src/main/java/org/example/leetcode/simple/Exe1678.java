package org.example.leetcode.simple;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by IntelliJ IDEA.
 * Author yuanxibin
 * CreatDate 2020/12/12 16:45
 * 类作用说明：
 * 请你设计一个可以解释字符串 command 的 Goal 解析器 。command 由 "G"、"()" 和/或 "(al)" 按某种顺序组成。Goal 解析器会将 "G" 解释为字符串 "G"、"()" 解释为字符串 "o" ，"(al)" 解释为字符串 "al" 。然后，按原顺序将经解释得到的字符串连接成一个字符串。
 *
 * 给你字符串 command ，返回 Goal 解析器 对 command 的解释结果。
 *
 * 示例 1：
 *
 * 输入：command = "G()(al)"
 * 输出："Goal"
 * 解释：Goal 解析器解释命令的步骤如下所示：
 * G -> G
 * () -> o
 * (al) -> al
 * 最后连接得到的结果是 "Goal"
 *
 * 示例 2：
 *
 * 输入：command = "G()()()()(al)"
 * 输出："Gooooal"
 *
 * 示例 3：
 *
 * 输入：command = "(al)G(al)()()G"
 * 输出："alGalooG"
 *
 * 提示：
 *
 *     1 <= command.length <= 100
 *     command 由 "G"、"()" 和/或 "(al)" 按某种顺序组成
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/goal-parser-interpretation
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class Exe1678 {

  /**
   * 直接使用字符串替换，使用正则替换的时候，总是替换的不正确，不知道为什么
   * @param command
   * @return
   */
  public static String interpret(String command) {
    command = command.replace("()", "o");
    command = command.replace("(al)", "al");
    return command;
  }

  /**
   * 使用字符数组进行替换
   * @param command
   * @return
   */
  public static String interpret1(String command) {
    if (command.length() == 0) {
      return null;
    }
    StringBuilder sb = new StringBuilder();
    int index = 0;
    while (index < command.length()) {
      if (command.charAt(index) == 'G') {
        sb.append('G');
        index += 1;
      } else if (command.charAt(index) == '(' && command.charAt(index + 1) == ')') {
        sb.append('o');
        index += 2;
      } else if (command.charAt(index) == '(' && command.charAt(index + 1) == 'a' && command.charAt(index + 2) == 'l' && command.charAt(index + 3) == ')') {
        sb.append('a');
        sb.append('l');
        index += 4;
      } else {
        sb.append(command.charAt(index));
        index += 1;
      }
    }
    return sb.toString();
  }

  @Test
  public void test1() {
    String command = "G()(al)()()()cdsdefsd(al)(al)";
    long t1 = System.currentTimeMillis();
    System.out.println(interpret(command));
    long t2 = System.currentTimeMillis();
    System.out.println(t2-t1);
    System.out.println(interpret1(command));
    System.out.println(System.currentTimeMillis()-t2);
  }

}
