class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int a=-10000;
        for(int i=0; i<nums.length; i++){
            if(i!=nums[i]){
                a=i;
                break;
            }
        }
        if(a==-10000){
            a=nums[nums.length-1]+1;
        }
    
        
        return a;
    }
}
