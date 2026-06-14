class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String op:operations){
            if(op.equals("+")){
                int top =st.pop();
                int sum=top+st.peek();
                st.push(top);
                st.push(sum);
            }else if(op.equals("C")){
                st.pop();
            }else if(op.equals("D")){
                st.push(2*st.peek());
            }else{
                st.push(Integer.valueOf(op));
            }
        }
        int sum=0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
}