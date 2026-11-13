class Solution {
    public int findMaximumCookieStudents(int[] Student, int[] Cookie) {
        //your code goes here
        Arrays.sort(Student);
        Arrays.sort(Cookie);

        int n1=Student.length;
        int n2=Cookie.length;
        int i=0;
        int j=0;
        int count=0;
        while(i!=n1&&j!=n2){
if(Cookie[j]<Student[i]){
    j++;
}
else if(Cookie[j]>=Student[i]){
    i++;
    j++;
    count++;
}
        }
        return count;
    }
}