class FindTarget {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> a1=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                a1.add(i);
            }
        }
        return a1;
    }
}