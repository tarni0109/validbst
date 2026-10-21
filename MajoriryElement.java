class MajorityElement {
    public List<Integer> majorityElementTwo(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);

        int count = 1;
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                if (count > n / 3) {
                    ans.add(nums[i - 1]);
                }
                count = 1;
            }
        }

        if (count > n / 3) {
            ans.add(nums[n - 1]);
        }

        return ans;
    }
}