class Solution {
        public static int trap(int []height){
        // calculate left max boundary array
        int leftMax [] = new  int [height.length]; 
        leftMax[0] = height[0];
        for(int i =1;i<height.length;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }
            
        //caluculate right max boundary array
        int rightMax [] = new int[height.length];
        int n = height.length-1;
        rightMax[n] = height[n];
        for(int i = n-1;i>=0;i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }
 
        //Loop
        int trappedwater = 0;
        int waterlevel = 0;
        for(int i=0;i<=n;i++){
            //WaterLevel = min(leftmax bound,rightmax bound ) 
            waterlevel = Math.min(leftMax[i],rightMax[i]);
        
        //trapped water = waterlevel - height
         trappedwater += waterlevel - height[i];
        }
        return trappedwater;
    }
}