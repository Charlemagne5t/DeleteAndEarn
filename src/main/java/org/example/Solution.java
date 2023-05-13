package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int deleteAndEarn(int[] nums) {
        Arrays.sort(nums);
        return 0;
    }
    public Map<Integer, Integer> arrayToMap(int[] array){
        Map<Integer, Integer> map = new HashMap<>();

        for (int x: array) {
            if(!map.containsKey(x)){
                map.put(x, x);
            }else{
               int newVal = map.get(x) + x;
               map.put(x, newVal);
            }
        }
        return map;
    }


}
