class main {
    public String maxSumOfSquares(int num, int sum) {
        if(num*9<sum){
            return "";
        }
        StringBuilder ans=new StringBuilder();
        while(sum>0&&ans.length() < num){
              int digit = Math.min(9, sum);
            ans.append(digit);
            sum -= digit;
        }
        
        while(ans.length()<num){
            ans.append(0);
        }
        return ans.toString();
    }
}