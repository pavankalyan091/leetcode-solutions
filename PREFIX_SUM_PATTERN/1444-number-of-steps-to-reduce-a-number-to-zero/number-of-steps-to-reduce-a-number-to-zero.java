class Solution {
    // by using recursion we are going slove this question ...
    public int helperFunction(int num,int count) {
        if(num==0){
            return count;
        }
        if(num%2==0){
            return helperFunction(num/2,count+1);
        }

        return helperFunction(num-1,count+1);
    }

    public int numberOfSteps(int num) {
        return helperFunction(num,0);
    }
}