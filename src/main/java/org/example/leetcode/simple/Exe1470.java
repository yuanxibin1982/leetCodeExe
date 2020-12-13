package org.example.leetcode.simple;

import org.junit.jupiter.api.Test;

/**
 * Created by IntelliJ IDEA.
 * Author yuanxibin
 * CreatDate 2020/12/13
 * 类作用说明：
 * 给你一个数组 nums ，数组中有 2n 个元素，按 [x1,x2,...,xn,y1,y2,...,yn] 的格式排列。
 *
 * 请你将数组按 [x1,y1,x2,y2,...,xn,yn] 格式重新排列，返回重排后的数组。
 *
 * 示例 1：
 *
 * 输入：nums = [2,5,1,3,4,7], n = 3
 * 输出：[2,3,5,4,1,7]
 * 解释：由于 x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 ，所以答案为 [2,3,5,4,1,7]
 *
 * 示例 2：
 *
 * 输入：nums = [1,2,3,4,4,3,2,1], n = 4
 * 输出：[1,4,2,3,3,2,4,1]
 *
 * 示例 3：
 *
 * 输入：nums = [1,1,2,2], n = 2
 * 输出：[1,2,1,2]
 *
 * 提示：
 *
 *     1 <= n <= 500
 *     nums.length == 2n
 *     1 <= nums[i] <= 10^3
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shuffle-the-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/

public class Exe1470 {
    public static int[] shuffle(int[] nums, int n) {
        int length = nums.length;
        int[] newNums = new int[length];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < length;) {
                newNums[index] = nums[j];
                j += n;
                index++;
            }
        }
        return newNums;
    }

    @Test
    public void test1() {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        for (int i : shuffle(nums, n)) {
            System.out.print(i + " ,");
        }
    }
}
