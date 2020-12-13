package org.example.leetcode.simple;


import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Author yuanxibin
 * CreatDate 2020/12/13
 * 类作用说明：
 * 给你一个整数数组 nums 。
 *
 * 如果一组数字 (i,j) 满足 nums[i] == nums[j] 且 i < j ，就可以认为这是一组 好数对 。
 *
 * 返回好数对的数目。
 *
 * 示例 1：
 *
 * 输入：nums = [1,2,3,1,1,3]
 * 输出：4
 * 解释：有 4 组好数对，分别是 (0,3), (0,4), (3,4), (2,5) ，下标从 0 开始
 *
 * 示例 2：
 *
 * 输入：nums = [1,1,1,1]
 * 输出：6
 * 解释：数组中的每组数字都是好数对
 *
 * 示例 3：
 *
 * 输入：nums = [1,2,3]
 * 输出：0
 *
 * 提示：
 *
 *     1 <= nums.length <= 100
 *     1 <= nums[i] <= 100
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/number-of-good-pairs
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/

public class Exe1512 {
    public static int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            integerMap.put(i, nums[i]);
        }
        for (int i = 0; i < integerMap.keySet().size(); i++) {
            for (int i1 = i + 1; i1 < integerMap.keySet().size(); i1++) {
                if (integerMap.get(i) == integerMap.get(i1)) {
                    num++;
                }
            }
        }
        return num;
    }

    public static int numIdenticalPairs1(int[] nums) {
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int i1 = i + 1; i1 < nums.length; i1++) {
                if (nums[i] == nums[i1]) {
                    num++;
                }
            }
        }
        return num;
    }

    @Test
    public void test1() {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
        System.out.println(numIdenticalPairs1(nums));
    }

    
}
