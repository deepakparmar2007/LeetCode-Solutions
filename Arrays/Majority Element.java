class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        
        for(int number:nums){
            freq.put(number,freq.getOrDefault(number,0)+1);
        }

        int hFreq=-1;
        int hKey=-1;

        for(int key:freq.keySet()){
            int curKey=key;
            int curFreq=freq.get(key);
            if(curFreq>hFreq){
                hFreq=curFreq;
                hKey=curKey;
            }
        }
        return hKey;
        
    }
}
