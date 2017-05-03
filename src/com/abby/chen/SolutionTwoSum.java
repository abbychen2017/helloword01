package com.abby.chen;

public class SolutionTwoSum {
    public int[] twoSum(int[] nums, int target) {
        for(int i =0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
    
    public static void main(String[] args){
    	SolutionTwoSum solution = new SolutionTwoSum();
        int[] nums = {2, 7, 11, 15,17};
        int target = 14;
       int[]  result = solution.twoSum(nums,target);
       if(result != null){
           System.out.println(result[0]+","+result[1]);
       }else{
    	   System.out.println("no found"); 
       }
    }
}

