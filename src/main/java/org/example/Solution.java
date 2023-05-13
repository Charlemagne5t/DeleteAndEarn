package org.example;

import java.util.*;

public class Solution {
    public int deleteAndEarn(int[] nums) {
        List<int[]> list = convert(nums);
        int n = list.size();
        int[] dp = new int[n];

        dp[0] = list.get(0)[1];
        for (int i = 1; i < n; i++) {
            int prevNum = list.get(i - 1)[0];
            int prevSum = (i - 2 >= 0) ? dp[i - 2] : 0;

            if (list.get(i)[0] == prevNum + 1) {
                dp[i] = Math.max(dp[i - 1], prevSum + list.get(i)[1]);
            } else {
                dp[i] = dp[i - 1] + list.get(i)[1];
            }
        }

        return dp[n - 1];
    }

    private List<int[]> convert(int[] nums) {
        Arrays.sort(nums);

        List<int[]> list = new ArrayList<>();
        int sum = 0;
        int prev = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != prev) {
                list.add(new int[]{prev, sum});
                prev = nums[i];
                sum = nums[i];
            } else {
                sum += nums[i];
            }
        }

        list.add(new int[]{prev, sum});

        return list;
    }
}
