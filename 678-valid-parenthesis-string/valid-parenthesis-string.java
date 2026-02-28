class Solution {
    public boolean checkValidString(String s) {
        int n = s.length();
        System.out.print(n);
        Stack<Integer> st = new Stack<>();
        Stack<Integer> gt = new Stack<>();
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(i);
            }
            else if(ch == '*'){
                gt.push(i);
            }
            else{
                if(!st.isEmpty()){
                    st.pop();
                }
                else if(!gt.isEmpty()){
                    gt.pop();
                }
                else{
                    return false;
                }
            }
        }   

        while(!st.isEmpty() && !gt.isEmpty()){
            if(st.peek() > gt.peek()){
                return false;
            }
            st.pop();
            gt.pop();
        }
        return st.isEmpty();
    }
}