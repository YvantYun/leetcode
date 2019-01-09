package solution_1;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum1(int[] nums,int target){
        //循环两次 复杂度为O(n2)--暴力解法
        int length = nums.length;
        for(int i = 0; i < length; i ++){
            for(int j = i+1 ; j < length ; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] { i, j };
                }
            }

        }
        throw new IllegalArgumentException("No two sum solution");
    }

    //hash
    public static int[] twoSum2(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length; i ++){
            map.put(nums[i],i);
        }
        for(int i = 0 ; i < nums.length; i ++){
            int res = target - nums[i];
            //map.containsKey(key)-->key(数组中的值),map.get(key)-->value(索引)
            if(map.containsKey(res) && map.get(res) != i){
                //如果map中有这个值并且索引不是原来的
                return new int[]{i,map.get(res)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static int[] twoSum3(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length; i ++){
            int res = target - nums[i];
            //map.containsKey(key)-->key(数组中的值),map.get(key)-->value(索引)
            if(map.containsKey(res) && map.get(res) != i){
                //如果map中有这个值并且索引不是原来的
                return new int[]{i,map.get(res)};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }


    public static void main(String[] args) {
        int[] nums = {2,9,3,6,11,15};
        int[] ints = twoSum3(nums, 9);
        for(int a :ints){
            System.out.println(a);
        }

    }
}
