package leecode;

import java.util.Arrays;

public class LC462 {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int l=0;int r=nums.length-1;
        int move=0;
        while(l<r){
            move+=nums[r--]-nums[l++];
        }
        return move;
    }
}
