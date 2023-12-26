package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static int[] twoSum(int[] nums, int target) {
        //can Implement it in o(n)
        //target-i
        int array[]=new int[2];
        Map<Integer,Integer>map=new HashMap<>();
        int length=nums.length;
        for(int i=0;i<length;++i){


                int key=target-nums[i];
                if(map.containsKey(nums[i])){
                    array[0]=map.get(nums[i]);
                    array[1]=i;
                    return array;
                }
                else
                    map.put(key,i);





        }
        return array;
    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character,Integer>map=new HashMap<>();
        int length=s.length();
        for(int i=0;i<length;++i){
            map.put(s.charAt(i),i);

        }

        return map.values().size();
    }
    public static void main(String[] args) {
        int array[]={-3,4,3,9};
        System.out.println(1069457<1108923?true:false);
    }
}