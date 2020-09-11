package leecode;

public class LC169 {
    public int majorityElement(int[] nums){

        int count=1;
        int len=nums.length;
        int ans=nums[0];

        for(int i=1;i<len;i++){
            if(nums[i]==ans)
                count++;
            else{
                if(count==1)
                    ans=nums[i];
                else
                    count--;
            }
        }
        return ans;
    }
}
