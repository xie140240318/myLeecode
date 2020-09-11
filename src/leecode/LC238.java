package leecode;

public class LC238 {
    public int[] productExceptSelf(int[] nums) {
        if(nums==null||nums.length<=1){
            return null;
        }
        int len =nums.length;
        int ans[]=new int [len];

        ans[0]=nums[0];
        for(int i=1;i<len;i++){
            ans[i]=ans[i-1]*nums[i];
        }
        for(int i=len-2;i>=0;i--){
            nums[i]*=nums[i+1];
        }

        int pre=ans[0];
        int now=0;
        ans[0]=nums[1];
        for(int i=1;i<len-1;i++){
            now=ans[i];
            ans[i]=pre*nums[i+1];
            pre=now;
        }
        ans[len-1]=pre;

        return ans;
    }
}
