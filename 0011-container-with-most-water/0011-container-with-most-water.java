class Solution {
    public int maxArea(int[] height) {
        int maxWater =0;
        int left = 0;
        int right = height.length-1;
        while(left<right){
            int height1 = Math.min(height[left],height[right]);
            int width = right-left;
            maxWater = Math.max(maxWater,height1*width);
            if(height[left]>height[right]){
                right--;
            }else{
                left++;
            }
        }
        return maxWater;
        
    }
}