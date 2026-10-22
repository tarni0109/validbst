class SecondHighest {
    public int secondMostFrequentElement(int[] nums) {
       HashMap<Integer, Integer> map = new HashMap<>();
       for (int num : nums) {
    map.put(num, map.getOrDefault(num, 0) + 1);

}
int max=0;
int secondmax=0;
int ans=-1;
for(int num:map.keySet()){
    int count=map.get(num);
    if(count>max){
        secondmax=max;
        max=count;
        
    }
    else if(count>secondmax&&count<max){
        secondmax=count;
       
    }
}
 for (int num : map.keySet()) {
            if (map.get(num) == secondmax) {
                if (ans == -1 || num < ans) {
                    ans = num;
                }
            }
        }
return ans;
}
}

