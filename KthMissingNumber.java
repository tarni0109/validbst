class KthMissingNumber{
    public static int findKthPositive(int[] arr, int k) {
        // Your code goes here
        int count=0;
        int i=1;
        int j=0;
        while(count<k){
            if(j<arr.length&&arr[j]==i){
                j++;
            }
            else{
                count++;
            }
            if(count==k){
                return i;
            }
            i++;
        }
        return -1;
    }
}