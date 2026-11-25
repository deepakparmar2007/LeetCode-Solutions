class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        List<Integer> ans=new ArrayList<>();


        for(int i=0;i<n;i++){
            int value=Math.abs(nums[i]);
            int pos=value-1;

            if(nums[pos]>0){
                nums[pos]=-nums[pos];
            }

        }

        for(int i=0;i<n;i++){
            if(nums[i]>0){
                int valueAtIndex=i+1;
                ans.add(valueAtIndex);
            }
        }
        return ans;
        
    }
}
