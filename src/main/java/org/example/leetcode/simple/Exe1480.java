package org.example.leetcode.simple;

/**
 * Created by IntelliJ IDEA.
 * Author yuanxibin
 * CreatDate 2020/12/12 15:03
 * 类作用说明：
 * 给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
 *
 * 请返回 nums 的动态和。
 *
 * 示例 1：
 *
 * 输入：nums = [1,2,3,4]
 * 输出：[1,3,6,10]
 * 解释：动态和计算过程为 [1, 1+2, 1+2+3, 1+2+3+4] 。
 *
 * 示例 2：
 *
 * 输入：nums = [1,1,1,1,1]
 * 输出：[1,2,3,4,5]
 * 解释：动态和计算过程为 [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1] 。
 *
 * 示例 3：
 *
 * 输入：nums = [3,1,2,10,1]
 * 输出：[3,4,6,16,17]
 *
 * 提示：
 *
 *     1 <= nums.length <= 1000
 *     -10^6 <= nums[i] <= 10^6
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/running-sum-of-1d-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class Exe1480 {

  /**
   * 在方法中新建数组，将原数组各元素复制，相加后填充到新数组中
   * @param nums
   * @return
   */
  public static int[] runningSum(int[] nums) {
    int temp = 0;
    int[] newArray = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      temp += nums[i];
      newArray[i] = temp;
    }
    return newArray;
  }

  /**
   * 网上看的方法，不新建数组，直接更新原数组，因第一个数不变，所以从第二个元素开始更新
   * @param nums
   * @return
   */
  public static int[] runningSum1(int[] nums) {
    for (int i = 1; i < nums.length; i++) {
      nums[i] += nums[i-1];
    }
    return nums;
  }

  public static void main(String[] args) {
    int[] nums = {3,1,2,10,1};
    for (int i : runningSum(nums)) {
      System.out.println(i);
    }

    for (int i : runningSum1(nums)) {
      System.out.println(i);
    }
  }

}
