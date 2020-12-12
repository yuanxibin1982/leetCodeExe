package org.example.leetcode.simple;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * Author yuanxibin
 * CreatDate 2020/12/12 9:59
 * 类作用说明：
 * 给你一个 m x n 的整数网格 accounts ，其中 accounts[i][j] 是第 i​​​​​​​​​​​​ 位客户在第 j 家银行托管的资产数量。返回最富有客户所拥有的 资产总量 。
 *
 * 客户的 资产总量 就是他们在各家银行托管的资产数量之和。最富有客户就是 资产总量 最大的客户。
 *
 * 示例 1：
 *
 * 输入：accounts = [[1,2,3],[3,2,1]]
 * 输出：6
 * 解释：
 * 第 1 位客户的资产总量 = 1 + 2 + 3 = 6
 * 第 2 位客户的资产总量 = 3 + 2 + 1 = 6
 * 两位客户都是最富有的，资产总量都是 6 ，所以返回 6 。
 *
 * 示例 2：
 *
 * 输入：accounts = [[1,5],[7,3],[3,5]]
 * 输出：10
 * 解释：
 * 第 1 位客户的资产总量 = 6
 * 第 2 位客户的资产总量 = 10
 * 第 3 位客户的资产总量 = 8
 * 第 2 位客户是最富有的，资产总量是 10
 *
 * 示例 3：
 *
 * 输入：accounts = [[2,8,7],[7,1,3],[1,9,5]]
 * 输出：17
 *
 * 提示：
 *
 *     m == accounts.length
 *     n == accounts[i].length
 *     1 <= m, n <= 50
 *     1 <= accounts[i][j] <= 100
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/richest-customer-wealth
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class Exe1672 {

  /**
   * 使用循环遍历
   * @param accounts
   * @return
   */
  public static int maximumWealth(int[][] accounts) {
//    Map<Integer, Integer> map = new HashMap<>();
    long t1 = System.currentTimeMillis();
    Set<Integer> set = new HashSet<>();

    for (int i = 0; i < accounts.length; i++) {
      int total = 0;
      for (int j = 0; j < accounts[i].length; j++) {
        total += accounts[i][j];
      }
//      map.put(i, total);
      set.add(total);
    }
    int num = Collections.max(set);
    System.out.println("用时：" + (System.currentTimeMillis() - t1));
    return num;
  }

  /**
   * 使用增强循环遍历
   * @param accounts
   * @return
   */
  public static int maximumWealth1(int[][] accounts) {
//    Map<Integer, Integer> map = new HashMap<>();
    long t1 = System.currentTimeMillis();
    Set<Integer> set = new HashSet<>();

    for (int[] account : accounts) {
      int total = 0;
      for (int i : account) {
        total += i;
      }
      set.add(total);
    }
    int num = Collections.max(set);
    System.out.println("用时：" + (System.currentTimeMillis() - t1));
    return num;
  }

  /**
   * 使用增强循环遍历，遍历一遍后，确定最大值
   * @param accounts
   * @return
   */
  public static int maximumWealth2(int[][] accounts) {
    long t1 = System.currentTimeMillis();
    int max = 0;
    for (int[] account : accounts) {
      int total = 0;
      for (int i : account) {
        total += i;
      }
      max = max > total ? max : total;
    }
    System.out.println("用时：" + (System.currentTimeMillis() - t1));
    return max;
  }

  public static void main(String[] args) {
    int[][] accounts1 = {{1,5},{7,3},{3,5},{3,8},{6,6},{4,33},{22,13}};
    System.out.println(maximumWealth(accounts1));
    int[][] accounts2 = {{1,2,3},{3,2,1}};
    System.out.println(maximumWealth(accounts2));

    System.out.println(maximumWealth1(accounts1));

    System.out.println(maximumWealth1(accounts2));

    System.out.println(maximumWealth2(accounts1));

    System.out.println(maximumWealth2(accounts2));
  }

}
